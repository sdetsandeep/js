// 29	29_increment.java	Increment a variable using the ++ operator (both pre and post).

public class _29_increment {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original value: " + a);
        System.out.println("Post-increment (a++): " + a++);
        System.out.println("After post-increment: " + a);
        System.out.println("Pre-increment (++a): " + (++a));
        System.out.println("After pre-increment: " + a);
    }
}
