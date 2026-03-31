package com.json.JSONProject;

import org.json.JSONArray;
import org.json.JSONObject;
public class DBToJSON {
    public static void main(String[] args) {
        JSONArray report = new JSONArray();
        JSONObject student1 = new JSONObject();
        student1.put("id", 1);
        student1.put("name", "David");
        student1.put("email", "david@gmail.com");
        student1.put("age", 22);

        JSONObject student2 = new JSONObject();
        student2.put("id", 2);
        student2.put("name", "wekko");
        student2.put("email", "wekko@gmail.com");
        student2.put("age", 21);

        report.put(student1);
        report.put(student2);

        System.out.println(report.toString(2));
    }
}