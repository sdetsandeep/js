// 139	139_count_consonants.java	Count the number of consonants in a given string using a loop.
public class _139_count_consonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray())
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) count++;
        System.out.println("Consonants: " + count);
    }
}
