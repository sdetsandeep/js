// 67	67_smallest_three.java	Find the smallest among three numbers using if-else if ladder.
public class _67_smallest_three {
    public static void main(String[] args) {
        int a = 12, b = 45, c = 30;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        if (a <= b && a <= c) System.out.println("Smallest: " + a);
        else if (b <= a && b <= c) System.out.println("Smallest: " + b);
        else System.out.println("Smallest: " + c);
    }
}
