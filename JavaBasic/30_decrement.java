// 30	30_decrement.java	Decrement a variable using the -- operator (both pre and post).

public class _30_decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Original value: " + a);
        System.out.println("Post-decrement (a--): " + a--);
        System.out.println("After post-decrement: " + a);
        System.out.println("Pre-decrement (--a): " + (--a));
        System.out.println("After pre-decrement: " + a);
    }
}
