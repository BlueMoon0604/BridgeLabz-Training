package collectiontwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime{
}
class ExecuteMethods{
	@LogExecutionTime
	public void fastMethod() {
		for(int i = 0 ; i < 1000 ; i ++) {
			
		}
	}
	@LogExecutionTime
	public void slowMethod() {
		for(int i = 0 ; i < 50000000 ; i++) {
			
		}
	}
	public void normalMethod() {
		System.out.println("Normal method");
	}
}
public class LoggingMethod {
	public static void main(String[] args) throws Exception {
		ExecuteMethods test = new ExecuteMethods();

        Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m : methods) {

            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(test);
                long end = System.nanoTime();
                long executionTime = end - start;
                System.out.println(m.getName() + " executed in " + executionTime + " ns");
            }
        }
		
	}

}
