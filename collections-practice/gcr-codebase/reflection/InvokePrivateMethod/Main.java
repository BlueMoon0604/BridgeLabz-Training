package InvokePrivateMethod;
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Calculator cal=new Calculator();
        	Class<?> c=cal.getClass();
        	Method m=c.getDeclaredMethod("multiply",int.class,int.class);
        	m.setAccessible(true);
        	int result=(int) m.invoke(cal,2,3);
        	System.out.println(result);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
