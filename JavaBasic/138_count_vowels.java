// 138	138_count_vowels.java	Count the number of vowels in a given string using a loop.
public class _138_count_vowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) if (vowels.indexOf(c) != -1) count++;
        System.out.println("String: " + str + " | Vowels: " + count);
    }
}
