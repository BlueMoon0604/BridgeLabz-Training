package collectiontwo;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)          
@interface TaskInfo {
    String priority();
    String assignedTo();
}
class TaskManager {

    @TaskInfo(priority = "Very High", assignedTo = "urus")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
public class CustomAnnotation {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();
        Method method = manager.getClass().getMethod("completeTask");
        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo task = method.getAnnotation(TaskInfo.class);

            System.out.println(task.priority());
            System.out.println(task.assignedTo());
        }
        manager.completeTask();
    }
}
