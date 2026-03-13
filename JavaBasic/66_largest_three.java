// 66	66_largest_three.java	Find the largest among three numbers using if-else if ladder.
public class _66_largest_three {
    public static void main(String[] args) {
        int a = 12, b = 45, c = 30;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        if (a >= b && a >= c) System.out.println("Largest: " + a);
        else if (b >= a && b >= c) System.out.println("Largest: " + b);
        else System.out.println("Largest: " + c);
    }
}
