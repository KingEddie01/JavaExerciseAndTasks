import java.util.Scanner;
import java.util.regex.Pattern;

public class Password_validator {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Password_validate();

    }

    public static void Password_validate() {
        System.out.println("Enter Password : ");
        String password = input.nextLine();

        if (password.length() < 8) {
            System.out.println("Length of password is below 8");
            Password_validate();}
        else if (!password.contains("$&+,:;=?@#|'<>.-^*()%!]")) {
            System.out.println("Password must contain special character");
            Password_validate();}

        else if (!password.matches(("[0-9]"))) {
            System.out.println("Password must contain a number");
            Password_validate();
                }
        else if (!password.matches("^-[A-Z]")) {
            System.out.println("Password does not contain Uppercase");
            Password_validate();
        }

        else if (!password.matches("^[a-z]")) {
                System.out.println("Password does not contain Lowercase");
                Password_validate();
            }
        else {
            System.out.println("Password is valid");
        }
    }
}

