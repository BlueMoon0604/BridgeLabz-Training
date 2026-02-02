package DynamicallyObjectCreate;
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Class<?> c=Class.forName("DynamicallyObjectCreate.Student");
        	Object obj = c.getDeclaredConstructor().newInstance();
        	System.out.println(obj);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
