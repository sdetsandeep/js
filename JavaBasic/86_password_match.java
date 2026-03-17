// 86	86_password_match.java	Check if a entered password matches the stored password.
public class _86_password_match {
    public static void main(String[] args) {
        String storedPassword = "secure123";
        String enteredPassword = "secure123";
        System.out.println("Entered: " + enteredPassword);
        if (enteredPassword.equals(storedPassword)) System.out.println("Password Match! Access Granted.");
        else System.out.println("Password Mismatch! Access Denied.");
    }
}
