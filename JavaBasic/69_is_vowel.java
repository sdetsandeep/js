// 69	69_is_vowel.java	Check whether a given character is a vowel (a, e, i, o, u).
public class _69_is_vowel {
    public static void main(String[] args) {
        char ch = 'e';
        String vowels = "aeiouAEIOU";
        System.out.println("Character: " + ch);
        if (vowels.indexOf(ch) != -1) System.out.println(ch + " is a Vowel.");
        else System.out.println(ch + " is NOT a Vowel.");
    }
}
