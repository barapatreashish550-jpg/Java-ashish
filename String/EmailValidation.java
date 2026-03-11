public class EmailValidation {
    public static void main(String[] args) {

        String email = "akash@gmail.com";

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
        
    }


}