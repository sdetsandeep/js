// 58	58_div_by_7_or_11.java	Check if a number is divisible by either 7 or 11.
public class _58_div_by_7_or_11 {
    public static void main(String[] args) {
        int num = 77;
        System.out.println("Number: " + num);
        if (num % 7 == 0 || num % 11 == 0) System.out.println(num + " is divisible by 7 or 11.");
        else System.out.println(num + " is NOT divisible by 7 or 11.");
    }
}
