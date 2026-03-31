package collectiontwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
	String level() default "High";
}
class Service{
	@ImportantMethod
	public void saveData() {
		System.out.println("Data is saving");
	}
	
	@ImportantMethod(level = "Medium")
	public void loadData() {
		System.out.println("Data is loaded");
	}
	public void shareData() {
		System.out.println("Data is saved");
	}
}
public class ImportantMethods {
	public static void main(String[] args) {
		Service service1 = new Service();
		
		Method[] methods = service1.getClass().getDeclaredMethods();
		for(Method m : methods) {
			if(m.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod im = m.getAnnotation(ImportantMethod.class);
				System.out.println("Method" + m.getName() + " with level " + im.level() );
			}
		}
	}

}
