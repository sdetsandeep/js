// 89	89_perfect_square.java	Check if a number is a perfect square using Math.sqrt().
public class _89_perfect_square {
    public static void main(String[] args) {
        int num = 49;
        double sqrt = Math.sqrt(num);
        System.out.println("Number: " + num);
        if (sqrt == (int)sqrt) System.out.println(num + " is a Perfect Square. sqrt = " + (int)sqrt);
        else System.out.println(num + " is NOT a Perfect Square.");
    }
}
