// 71	71_is_alphabet.java	Check whether a given character is an alphabet letter.
public class _71_is_alphabet {
    public static void main(String[] args) {
        char ch = 'G';
        System.out.println("Character: " + ch);
        if (Character.isLetter(ch)) System.out.println(ch + " is an Alphabet.");
        else System.out.println(ch + " is NOT an Alphabet.");
    }
}
