// 70	70_is_consonant.java	Check whether a given character is a consonant.
public class _70_is_consonant {
    public static void main(String[] args) {
        char ch = 'b';
        String vowels = "aeiouAEIOU";
        System.out.println("Character: " + ch);
        if (Character.isLetter(ch) && vowels.indexOf(ch) == -1)
            System.out.println(ch + " is a Consonant.");
        else
            System.out.println(ch + " is NOT a Consonant.");
    }
}
