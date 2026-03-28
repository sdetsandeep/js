// 147	147_sum_odd.java	Find the sum of all odd numbers from 1 to 100.
public class _147_sum_odd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) sum += i;
        System.out.println("Sum of odd numbers 1-100: " + sum);
    }
}
