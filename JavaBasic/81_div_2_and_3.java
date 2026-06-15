// 81	81_div_2_and_3.java	Find whether a number is divisible by both 2 and 3.
public class _81_div_2_and_3 {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("Number: " + num);
        if (num%2==0 && num%3==0) System.out.println(num + " is divisible by both 2 and 3.");
        else System.out.println(num + " is NOT divisible by both 2 and 3.");
    }
}
