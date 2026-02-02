package collectiontwo;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}
class Roles {
    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully");
    }

    public void viewProfile() {
        System.out.println("Profile viewed");
    }
}
public class RoleBasedAccess {
    static String currentUserRole = "USER";   
    public static void main(String[] args) throws Exception {

        Roles r1 = new Roles();
        Method[] methods = r1.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equals("deleteUser")) {
                if (method.isAnnotationPresent(RoleAllowed.class)) {
                    RoleAllowed role = method.getAnnotation(RoleAllowed.class);
                    if (currentUserRole.equals(role.value())) {
                        method.invoke(r1);
                    } else {
                        System.out.println("Access Denied");
                    }
                }
            }
        }
    }
}
