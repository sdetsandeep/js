// 54	54_one_negative.java	Check whether at least one of two numbers is negative.
public class _54_one_negative {
    public static void main(String[] args) {
        int a = 5, b = -4;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("At least one negative: " + (a < 0 || b < 0));
    }
}
