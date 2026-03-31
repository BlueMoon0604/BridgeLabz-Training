package com.json.JSONProject;
import org.json.JSONArray;
import org.json.JSONObject;
public class StudentJSON {
	public static void main(String[] args) {
		JSONObject student1 = new JSONObject();
		student1.put("name", "Nova");
		student1.put("age", 21);
		
		JSONArray subjects = new JSONArray();
		subjects.put("Maths");
		subjects.put("Social Science");
		subjects.put("Chemistry");
		
		student1.put("subjects", subjects);
		System.out.println(student1.toString(4));
	}

}
