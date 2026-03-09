// 42	42_compare_strict.java	Compare two values using === (strict equality) and observe the difference.
public class _42_compare_strict {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.0;
        // In Java, == on primitives is always strict (type + value)
        System.out.println("int a = " + a + ", double b = " + b);
        System.out.println("a == b (int vs double auto-promoted): " + (a == b));
        System.out.println("In Java, == checks value strictly; for objects use .equals()");

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("s1 == s2 (reference): " + (s1 == s2));
        System.out.println("s1.equals(s2) (value): " + s1.equals(s2));
    }
}
