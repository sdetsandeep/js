// 146	146_ascii_values.java	Print the ASCII (char code) value of each character in a string.
public class _146_ascii_values {
    public static void main(String[] args) {
        String str = "Hello";
        for (char c : str.toCharArray())
            System.out.println("'" + c + "' => " + (int)c);
    }
}
