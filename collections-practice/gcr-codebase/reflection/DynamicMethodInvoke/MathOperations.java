package DynamicMethodInvoke;

public class MathOperations {
    public int add(int a,int b) {
    	return a+b;
    }
    public int subtract(int a,int b) {
    	if(a>b) {
    		return a-b;
    	}
    	return b-a;
    }
    public int multiply(int a,int b) {
    	return a*b;
    }
}
