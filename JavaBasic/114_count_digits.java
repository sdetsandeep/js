// 114	114_count_digits.java	Count the number of digits in a given number.
public class _114_count_digits {
    public static void main(String[] args) {
        int num = 948321, count = 0, temp = num;
        while (temp > 0) { count++; temp /= 10; }
        System.out.println("Number: " + num + " | Digits: " + count);
    }
}
