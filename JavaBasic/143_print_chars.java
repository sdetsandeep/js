// 143	143_print_chars.java	Print each character of a string one by one using a loop.
public class _143_print_chars {
    public static void main(String[] args) {
        String str = "Java";
        for (int i = 0; i < str.length(); i++)
            System.out.println("Index " + i + ": " + str.charAt(i));
    }
}
