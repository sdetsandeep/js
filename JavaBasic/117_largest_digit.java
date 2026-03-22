// 117	117_largest_digit.java	Find the largest digit in a given number.
public class _117_largest_digit {
    public static void main(String[] args) {
        int num = 39271, largest = 0, temp = num;
        while (temp > 0) { int d = temp%10; if(d>largest) largest=d; temp/=10; }
        System.out.println("Number: " + num + " | Largest digit: " + largest);
    }
}
