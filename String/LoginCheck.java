public class LoginCheck {
    public static void main(String[] args) {

        String savedUsername = "Rahul";
        String inputUsername = "rahul";

        String savedPassword = "Java@123";
        String inputPassword = "Java@123";

        if (savedUsername.equalsIgnoreCase(inputUsername)
                && savedPassword.equals(inputPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}