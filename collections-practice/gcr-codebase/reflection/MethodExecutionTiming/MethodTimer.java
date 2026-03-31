package MethodExecutionTiming;
import java.lang.reflect.Method;
public class MethodTimer {
	public static Object executeWithTiming(
            Object obj,
            String methodName,
            Class<?>[] paramTypes,
            Object[] args) {

        try {
            Class<?> clazz = obj.getClass();

            
            Method method = clazz.getMethod(methodName, paramTypes);

           
            long start = System.nanoTime();

           
            Object result = method.invoke(obj, args);

            
            long end = System.nanoTime();

            System.out.println(
                "Method " + methodName + " executed in " + (end - start) + " ns"
            );

            return result;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
