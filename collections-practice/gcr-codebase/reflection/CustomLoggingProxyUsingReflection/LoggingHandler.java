package CustomLoggingProxyUsingReflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class LoggingHandler implements InvocationHandler{
	private Object target; // original object

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        
        System.out.println("Method called: " + method.getName());

        
        return method.invoke(target, args);
    }
}
