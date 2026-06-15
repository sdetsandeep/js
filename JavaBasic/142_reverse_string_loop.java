// 142	142_reverse_string_loop.java	Reverse a given string using a loop (without built-in reverse).
public class _142_reverse_string_loop {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) reversed += str.charAt(i);
        System.out.println("Original: " + str + " | Reversed: " + reversed);
    }
}
