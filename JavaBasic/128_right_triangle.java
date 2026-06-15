// 128	128_right_triangle.java	Print a right-angled triangle star pattern using nested loops.
public class _128_right_triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
