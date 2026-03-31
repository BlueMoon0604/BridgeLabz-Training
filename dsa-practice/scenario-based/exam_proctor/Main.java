package exam_proctor;

public class Main {
    public static void main(String[] args) {
        ExamSession exam = new ExamSession();
        exam.visitQuestion(1);
        exam.answerQuestion(1, "B");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "C");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "C");

        exam.goBack();
        exam.visitQuestion(4);
        exam.answerQuestion(4, "A");
        exam.submitExam();
    }
}
