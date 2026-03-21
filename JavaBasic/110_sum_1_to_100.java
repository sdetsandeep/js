// 110	110_sum_1_to_100.java	Find the sum of all numbers from 1 to 100 using a loop.
public class _110_sum_1_to_100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) sum += i;
        System.out.println("Sum of 1 to 100: " + sum);
    }
}
