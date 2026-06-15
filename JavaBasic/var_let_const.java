// 4	var_let_const.java	Declare variables using var, let, and const and observe their differences.

public class var_let_const {
    public static void main(String[] args) {
        // In Java: use different types to show similar concept
        int mutableVar = 10;          // like var/let - can be changed
        final int CONSTANT = 100;     // like const - cannot be changed

        System.out.println("Mutable variable: " + mutableVar);
        mutableVar = 20;
        System.out.println("After modification: " + mutableVar);
        System.out.println("Constant value: " + CONSTANT);
        // CONSTANT = 200; // This would cause a compile-time error
        System.out.println("Constants cannot be reassigned in Java.");
    }
}
