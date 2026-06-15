// 10	undefined_var.java	Create a variable without assigning a value and print its output.

public class undefined_var {
    public static void main(String[] args) {
        // In Java, instance variables get default values
        int num;          // local variable - uninitialized
        Integer obj = null; // reference type can be null (similar to undefined)

        System.out.println("Unassigned Integer object: " + obj);
        // Note: Using uninitialized local 'num' would cause compile error
        System.out.println("In Java, local variables must be initialized before use.");
        System.out.println("Reference types default to: null");
        System.out.println("Primitive int defaults to: 0 (as instance variable)");
    }
}
