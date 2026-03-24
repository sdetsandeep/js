// 129	129_inverted_triangle.java	Print an inverted right-triangle star pattern using nested loops.
public class _129_inverted_triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
