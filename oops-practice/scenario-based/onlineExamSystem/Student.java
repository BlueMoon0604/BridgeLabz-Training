package onlineExamSystem;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private int rollNo;
	private String name;
	private Map<Integer, String> answers = new HashMap<>();
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	public void submitAnswers(int questionId, String answer) {
		answers.put(questionId, answer);
	}
	public Map<Integer, String > getAnswers(){
		return answers;
	}
	public String getName() {
		return name;
	}
}
