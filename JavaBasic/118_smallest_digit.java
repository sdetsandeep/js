// 118	118_smallest_digit.java	Find the smallest digit in a given number.
public class _118_smallest_digit {
    public static void main(String[] args) {
        int num = 39271, smallest = 9, temp = num;
        while (temp > 0) { int d = temp%10; if(d<smallest) smallest=d; temp/=10; }
        System.out.println("Number: " + num + " | Smallest digit: " + smallest);
    }
}
