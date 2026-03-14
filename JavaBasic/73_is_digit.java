// 73	73_is_digit.java	Check whether a given character is a digit (0–9).
public class _73_is_digit {
    public static void main(String[] args) {
        char ch = '7';
        System.out.println("Character: " + ch);
        if (Character.isDigit(ch)) System.out.println(ch + " is a Digit.");
        else System.out.println(ch + " is NOT a Digit.");
    }
}
