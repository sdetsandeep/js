// 57	57_div_by_3_and_5.java	Check if a number is divisible by both 3 and 5.
public class _57_div_by_3_and_5 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println("Number: " + num);
        if (num % 3 == 0 && num % 5 == 0) System.out.println(num + " is divisible by both 3 and 5.");
        else System.out.println(num + " is NOT divisible by both 3 and 5.");
    }
}
