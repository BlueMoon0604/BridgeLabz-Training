package iplAndCensorAnalyzer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            censorJson("input.json", "output.json");
            censorCsv("input.csv", "output.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void censorJson(String input, String output) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) mapper.readTree(new File(input));

        for (JsonNode m : matches) {
            maskTeams(m);
            ((com.fasterxml.jackson.databind.node.ObjectNode) m).put("player_of_match", "REDACTED");
        }
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(output), matches);
    }
    private static void maskTeams(JsonNode match) {

        String team1 = match.get("team1").asText();
        String team2 = match.get("team2").asText();

        String maskedTeam1 = maskTeam(team1);
        String maskedTeam2 = maskTeam(team2);

        ((com.fasterxml.jackson.databind.node.ObjectNode) match).put("team1", maskedTeam1);
        ((com.fasterxml.jackson.databind.node.ObjectNode) match).put("team2", maskedTeam2);

        JsonNode score = match.get("score");
        if (score != null && score.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = score.fields();
            com.fasterxml.jackson.databind.node.ObjectNode newScore = new ObjectMapper().createObjectNode();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                newScore.set(maskTeam(entry.getKey()), entry.getValue());
            }
            ((com.fasterxml.jackson.databind.node.ObjectNode) match).set("score", newScore);
        }
    }
    private static void censorCsv(String input, String output) throws Exception {

        CSVReader reader = new CSVReader(new FileReader(input));
        CSVWriter writer = new CSVWriter(new FileWriter(output));

        String[] row;
        boolean isHeader = true;

        while ((row = reader.readNext()) != null) {
            if (isHeader) {
                writer.writeNext(row);
                isHeader = false;
                continue;
            }
            row[1] = maskTeam(row[1]); 
            row[2] = maskTeam(row[2]);
            row[5] = maskTeam(row[5]); 
            row[6] = "REDACTED";   
            writer.writeNext(row);
        }
        reader.close();
        writer.close();
    }
    private static String maskTeam(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }
}

