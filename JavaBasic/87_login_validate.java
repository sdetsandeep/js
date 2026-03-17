// 87	87_login_validate.java	Validate both username and password and print login status.
public class _87_login_validate {
    public static void main(String[] args) {
        String storedUser = "admin", storedPass = "admin@123";
        String inputUser = "admin", inputPass = "admin@123";
        if (inputUser.equals(storedUser) && inputPass.equals(storedPass))
            System.out.println("Login Successful!");
        else if (!inputUser.equals(storedUser))
            System.out.println("Invalid Username.");
        else
            System.out.println("Invalid Password.");
    }
}
