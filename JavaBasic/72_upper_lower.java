// 72	72_upper_lower.java	Check whether a character is uppercase or lowercase.
public class _72_upper_lower {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Character: " + ch);
        if (Character.isUpperCase(ch)) System.out.println(ch + " is Uppercase.");
        else if (Character.isLowerCase(ch)) System.out.println(ch + " is Lowercase.");
        else System.out.println(ch + " is not an alphabet.");
    }
}
