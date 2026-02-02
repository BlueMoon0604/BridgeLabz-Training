package collectiontwo;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}
class Calculator {
    @CacheResult
    public int slowSquare(int n) {
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Computing square for " + n);
        return n * n;
    }
}
public class CachingSystem {
    static Map<String, Object> cache = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();
        System.out.println(getCachedResult(calc, "slowSquare", 5));
        System.out.println(getCachedResult(calc, "slowSquare", 5)); 
        System.out.println(getCachedResult(calc, "slowSquare", 6));
        System.out.println(getCachedResult(calc, "slowSquare", 5));
    }
    public static Object getCachedResult(Object obj, String methodName, int param)
            throws Exception {

        Method method = obj.getClass().getMethod(methodName, int.class);
        String key = methodName + "_" + param;

        if (method.isAnnotationPresent(CacheResult.class)) {
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for " + param);
                return cache.get(key);
            }
            Object result = method.invoke(obj, param);
            cache.put(key, result);
            return result;
        }
        return method.invoke(obj, param);
    }
}
