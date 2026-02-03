package com.json.JSONProject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ExtractFieldsFromJson {
    public static void main(String[] args) {
        try {
            // Path to your JSON file
            File file = new File("students.json");

            // Create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            JsonNode root = mapper.readTree(file);
            for (JsonNode student : root) {
                String name = student.get("name").asText();
                String email = student.get("email").asText();

                System.out.println("Name: " + name + ", Email: " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
