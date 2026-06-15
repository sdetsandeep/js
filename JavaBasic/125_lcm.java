// 125	125_lcm.java	Find the LCM (Least Common Multiple) of two numbers using a loop.
public class _125_lcm {
    public static void main(String[] args) {
        int a = 12, b = 18, x = 12, y = 18;
        while (y != 0) { int t = y; y = x%y; x = t; }
        System.out.println("LCM of " + a + " and " + b + " = " + (a*b/x));
    }
}
