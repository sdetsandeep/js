// 113	113_reverse_number.java	Reverse a given number using a while loop (e.g. 1234 → 4321).
public class _113_reverse_number {
    public static void main(String[] args) {
        int num = 1234, original = 1234, reversed = 0;
        while (num > 0) { reversed = reversed*10 + num%10; num /= 10; }
        System.out.println("Original: " + original + " | Reversed: " + reversed);
    }
}
