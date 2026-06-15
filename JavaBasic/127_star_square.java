// 127	127_star_square.java	Print a square star pattern of n×n size using nested loops.
public class _127_star_square {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
