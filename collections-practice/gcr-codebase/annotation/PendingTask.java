package collectiontwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
	String task();
	String assignedTo();
	String priority()  default "Medium";
}
class ProjectService{
	@Todo(task = "Make login button" , assignedTo = "Eric", priority = "Low")
	public void loginButton() {
		System.out.println("Login buttopn");
		
	}
	@Todo(task = "Add forgot password", assignedTo = "Nova")
	public void forgotPassword() {
		System.out.println("forgot password");
		
	}
	@Todo(task = "create dashborad", assignedTo = "Raven", priority = "High")
	public void dashBoard() {
		System.out.println("Dasboard module");
		
	}
	public void complete() {
		System.out.println("Completed Project");
		
	}
	
}
public class PendingTask {
	public static void main(String[] args) {
		ProjectService service1 = new ProjectService();
		
		Method[] methods = service1.getClass().getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(Todo.class)) {
				Todo t = m.getAnnotation(Todo.class);
				System.out.println("Method " + m.getName() + " Task " + t.task() + " Assigned to " +t.assignedTo() + " have Priority " + t.priority());
			}
		}
		
	}

}
