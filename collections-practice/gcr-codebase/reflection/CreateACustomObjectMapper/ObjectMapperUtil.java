package CreateACustomObjectMapper;
import java.util.*;
import java.lang.reflect.*;
public class ObjectMapperUtil {
	 public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
	        try {
	            
	            T object = clazz.getDeclaredConstructor().newInstance();

	           
	            for (Map.Entry<String, Object> entry : properties.entrySet()) {

	                String fieldName = entry.getKey();
	                Object fieldValue = entry.getValue();

	                
	                Field field = clazz.getDeclaredField(fieldName);

	                
	                field.setAccessible(true);

	               
	                field.set(object, fieldValue);
	            }

	            return object;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	 }
}
