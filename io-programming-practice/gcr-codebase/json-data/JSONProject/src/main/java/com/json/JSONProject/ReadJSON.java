package com.json.JSONProject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadJSON {
    public static void main(String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File("data.json");
            JsonNode jsonData = objectMapper.readTree(jsonFile);
            displayJsonData(jsonData);

        } catch (Exception ex) {
            System.out.println("error occurs in reading json file");
            ex.printStackTrace();
        }
    }
    private static void displayJsonData(JsonNode currentNode) {
        if (currentNode.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> iterator = currentNode.fields();
            while (iterator.hasNext()) {
                Map.Entry<String, JsonNode> field = iterator.next();
                System.out.println(field.getKey() + ":" + field.getValue());
                displayJsonData(field.getValue());
            }
        }else if (currentNode.isArray()) {

            for (JsonNode element : currentNode) {
                displayJsonData(element);
            }
        }
    }
}
       

