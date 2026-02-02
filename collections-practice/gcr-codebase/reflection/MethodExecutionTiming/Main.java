package MethodExecutionTiming;

public class Main {
	public static void main(String[] args) {

        MathOperations math = new MathOperations();

        Object result = MethodTimer.executeWithTiming(
                math,
                "add",
                new Class[]{int.class, int.class},
                new Object[]{10, 20}
        );

        System.out.println("Result: " + result);
    }
}
