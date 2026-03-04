// 20	20_multiline_string.java	Print a multiline string using template literals or \n escape character.

public class _20_multiline_string {
    public static void main(String[] args) {
        // Using \n escape character
        String multiline = "Line 1: Hello\nLine 2: World\nLine 3: Java";
        System.out.println(multiline);

        System.out.println("---");

        // Using Text Block (Java 15+)
        String textBlock = """
                Name: Alice
                Age:  22
                City: Delhi
                """;
        System.out.print(textBlock);
    }
}
