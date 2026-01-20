package exam_proctor;

import java.util.*;

class ExamSession {
    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    public ExamSession() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }
    public void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answered Q" + questionId + ": " + answer);
    }
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        navigationStack.pop();
        if (!navigationStack.isEmpty()) {
            System.out.println("Back to Question: " + navigationStack.peek());
        }
    }
    public int calculateScore() {
        int score = 0;
        for (int questionId : correctAnswers.keySet()) {
            if (correctAnswers.get(questionId)
                    .equals(answers.get(questionId))) {
                score++;
            }
        }
        return score;
    }
    public void submitExam() {
        System.out.println("Exam is submitted");
        System.out.println("Final Score: " + calculateScore() + "/" + correctAnswers.size());
    }
}
