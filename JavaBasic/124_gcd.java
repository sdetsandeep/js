// 124	124_gcd.java	Find the GCD (Greatest Common Divisor) of two numbers using a loop.
public class _124_gcd {
    public static void main(String[] args) {
        int a = 48, b = 18, x = 48, y = 18;
        while (y != 0) { int t = y; y = x%y; x = t; }
        System.out.println("GCD of " + a + " and " + b + " = " + x);
    }
}
