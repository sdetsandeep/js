// 115	115_sum_digits.java	Find the sum of all digits of a given number.
public class _115_sum_digits {
    public static void main(String[] args) {
        int num = 4567, sum = 0, temp = num;
        while (temp > 0) { sum += temp%10; temp /= 10; }
        System.out.println("Number: " + num + " | Sum of digits: " + sum);
    }
}
