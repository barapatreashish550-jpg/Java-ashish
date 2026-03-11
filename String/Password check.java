
public class PasswordCheck {
    public static void main(String[] args) {

        String password = "Java@123";

        if (password.length() >= 8) {
            System.out.println("Password length is valid");
            System.out.println("First character : " + password.charAt(0));
        } else {
            System.out.println("Password too short");
        }
    }
}
