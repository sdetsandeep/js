// 83	83_multiple_of_10.java	Find whether a given number is a multiple of 10.
public class _83_multiple_of_10 {
    public static void main(String[] args) {
        int num = 40;
        System.out.println("Number: " + num);
        if (num%10==0) System.out.println(num + " is a multiple of 10.");
        else System.out.println(num + " is NOT a multiple of 10.");
    }
}
