// 133	133_number_triangle.java	Print a right-triangle pattern filled with row numbers.
public class _133_number_triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(i + " ");
            System.out.println();
        }
    }
}
