// 135	135_hollow_square.java	Print a hollow square border pattern of stars using nested loops.
public class _135_hollow_square {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1||i==n||j==1||j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
