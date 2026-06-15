// 145	145_count_lowercase.java	Count the number of lowercase letters in a given string.
public class _145_count_lowercase {
    public static void main(String[] args) {
        String str = "Hello World JS";
        int count = 0;
        for (char c : str.toCharArray()) if (Character.isLowerCase(c)) count++;
        System.out.println("Lowercase count: " + count);
    }
}
