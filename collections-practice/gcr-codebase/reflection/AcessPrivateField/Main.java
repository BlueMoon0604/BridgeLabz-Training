package AcessPrivateField;
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Person p = new Person();
        	Class<?> c = p.getClass();
        	Field field = c.getDeclaredField("age");
        	field.setAccessible(true);
        	field.set(p, 21);
        	int ageValue = (int) field.get(p);
        	System.out.println("Age is: " + ageValue);

        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
