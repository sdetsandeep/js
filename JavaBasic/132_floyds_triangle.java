// 132	132_floyds_triangle.java	Print Floyd's triangle with sequential numbers using nested loops.
public class _132_floyds_triangle {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(num++ + " ");
            System.out.println();
        }
    }
}
