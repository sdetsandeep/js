// 126	126_power_loop.java	Calculate the power of a number using a loop (without ** operator).
public class _126_power_loop {
    public static void main(String[] args) {
        int base = 3, exponent = 4, result = 1;
        for (int i = 1; i <= exponent; i++) result *= base;
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
