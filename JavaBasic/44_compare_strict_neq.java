// 44	44_compare_strict_neq.java	Compare two values using !== (strict not equal) operator.
public class _44_compare_strict_neq {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.0;
        System.out.println("int a = " + a + ", double b = " + b);
        System.out.println("a != b: " + (a != b));
        String s1 = "hello";
        String s2 = "world";
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("!s1.equals(s2): " + !s1.equals(s2));
    }
}
