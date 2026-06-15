// 134	134_alphabet_triangle.java	Print a right-triangle pattern filled with alphabets (A, B, C...).
public class _134_alphabet_triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print((char)('A'+j) + " ");
            System.out.println();
        }
    }
}
