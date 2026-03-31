package com.json.JSONProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class JSONToXML {
    public static void main(String[] args) throws Exception {
        String json = "{ \"name\": \"Nova\", \"age\": 21, \"city\": \"Seoul\" }";
 
        ObjectMapper jsonMapper = new ObjectMapper();
        Object data = jsonMapper.readValue(json, Object.class);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(data);
        System.out.println(xml);
    }
}