// 148	148_sum_even.java	Find the sum of all even numbers from 1 to 100.
public class _148_sum_even {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) sum += i;
        System.out.println("Sum of even numbers 1-100: " + sum);
    }
}
