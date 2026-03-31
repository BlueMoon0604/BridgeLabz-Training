package DependencyInjectionUsingReflection;
import java.lang.reflect.Field;
public class DIContainer {
	public static <T> T createObject(Class<T> clazz) {

        try {
            // Object create karo
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Sare fields lo
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {

                // Check @Inject laga hai ya nahi
                if (field.isAnnotationPresent(Inject.class)) {

                    // Dependency ka object banao
                    Class<?> dependencyType = field.getType();
                    Object dependency = dependencyType
                            .getDeclaredConstructor()
                            .newInstance();

                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
