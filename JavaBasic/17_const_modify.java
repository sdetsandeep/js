// 17	17_const_modify.java	Declare a constant and try to modify it — observe the error.

public class _17_const_modify {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println("Constant MAX_VALUE = " + MAX_VALUE);

        // Trying to modify a final variable causes compile-time error in Java
        // MAX_VALUE = 200; // ERROR: cannot assign a value to final variable MAX_VALUE

        System.out.println("Attempting to change a final variable causes a compile-time error.");
        System.out.println("final keyword in Java = const in JavaScript.");
    }
}
