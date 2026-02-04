package PasswordStrengthValidator;

public class Main {
	public static void main(String[] args) {

        String password1 = "WEE@123";
        String password2 = "raven";
        String password3 = "AQUA@2024";

        checkPassword(password1);
        checkPassword(password2);
        checkPassword(password3);
    }

    static void checkPassword(String password) {

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password: " + password);
        } else {
            System.out.println("Weak Password: " + password);
        }
    }
}
