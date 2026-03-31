package com.json.JSONProject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json1 = "{ \"name\": \"Nova\", \"age\": 21 }";
            String json2 = "{ \"email\": \"nova@gmail.com\", \"department\": \"Computer Science\" }";

            JsonNode node1 = mapper.readTree(json1);
            JsonNode node2 = mapper.readTree(json2);

            if (node1.isObject() && node2.isObject()) {
                ((ObjectNode) node1).setAll((ObjectNode) node2);
            }
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

