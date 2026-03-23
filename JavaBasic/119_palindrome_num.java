// 119	119_palindrome_num.java	Check whether a given number is a palindrome (e.g. 121, 1331).
public class _119_palindrome_num {
    public static void main(String[] args) {
        int num = 1331, original = 1331, reversed = 0, temp = num;
        while (temp > 0) { reversed = reversed*10 + temp%10; temp /= 10; }
        System.out.println("Number: " + original);
        System.out.println(original == reversed ? "Palindrome." : "NOT a Palindrome.");
    }
}
