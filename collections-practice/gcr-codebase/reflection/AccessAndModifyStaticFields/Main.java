package AccessAndModifyStaticFields;
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Configuration configuration=new Configuration();
        	Class<?> c=configuration.getClass();
        	Field field=c.getDeclaredField("API_KEY");
        	field.setAccessible(true);
        	field.set(null,"New_key");
        	String value = (String) field.get(null);
            System.out.println(value);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
