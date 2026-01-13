package onlineExamSystem;

public class Questions {
    private int id;
    private String question;
    private String correctAnswer;
    private int marks;
    public Questions(int id, String question, String correctAnswer, int marks) {
        this.id = id;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public int getMarks() {
        return marks;
    }
}

