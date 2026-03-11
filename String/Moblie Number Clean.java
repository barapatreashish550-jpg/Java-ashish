public class MobileNumberClean {
    public static void main(String[] args) {

        String mobile = "  +91-98765-43210  ";

        mobile = mobile.trim();           // remove extra spaces
        mobile = mobile.replace("-", ""); // remove hyphens

        System.out.println("Clean Mobile Number : " + mobile);
    }
}