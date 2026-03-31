package DynamicallyObjectCreate;
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
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
