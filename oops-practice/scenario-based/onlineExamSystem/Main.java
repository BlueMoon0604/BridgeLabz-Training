package onlineExamSystem;
public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam(1, "Java Online Test");

        exam.addQuestion(new Questions(1, "What is the color of royalty", "Purple", 10));
        exam.addQuestion(new Questions(2, "What is King of fruit", "Mango", 10));
        Student student = new Student(101, "Navya");
        student.submitAnswers(1, "Purple");
        student.submitAnswers(2, "Mango");
        try {
            exam.submitExam(student);
            EvaluationStrategy evaluation =
                    new ObjectiveEvaluation(); 
            int result = exam.generateResult(student, evaluation);
            System.out.println("Final Score: " + result);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
