package GetClassInfo;
import java.lang.reflect.*;
import java.util.regex.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	// load the class
        	Class<?> c=Class.forName("GetClassInfo.Student");
        	// for getting full name with package name also 
        	System.out.println(c.getName());
        	// getting only class name
        	System.out.println(c.getSimpleName());
        	Method[] method=c.getDeclaredMethods();
        	for(Method m:method) {
        		System.out.println(m.getName());
        	}
        	Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f.getName());
            }
            Constructor<?>[] constructors = c.getDeclaredConstructors();
            for (Constructor<?> cn : constructors) {
                String input=cn.getName();
                Pattern p=Pattern.compile("[^.][a-zA-Z]+$");
                Matcher m = p.matcher(input);
                while(m.find()) {
                	System.out.println(m.group());
                }
            }
        }
        catch(ClassNotFoundException e) {
        	System.out.println("Class not found!");
        }
	}

}
