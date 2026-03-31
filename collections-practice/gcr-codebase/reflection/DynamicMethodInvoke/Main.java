package DynamicMethodInvoke;
import java.util.*;
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("write the method name:");
        	String method=sc.next();
        	MathOperations obj = new MathOperations();
        	Class<?> c=obj.getClass();
        	Method m=c.getMethod(method,int.class,int.class);
        	int result=(int) m.invoke(obj, 2,5);
        	System.out.println(result);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
