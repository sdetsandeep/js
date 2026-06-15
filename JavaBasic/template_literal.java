// 13	template_literal.java	Use template literals (backticks) to print a formatted sentence with variables.

public class template_literal {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 22;
        String city = "Mumbai";

        // Java uses String.format() similar to template literals
        String sentence = String.format("My name is %s, I am %d years old, and I live in %s.", name, age, city);
        System.out.println(sentence);

        // Also using formatted() method (Java 15+)
        String sentence2 = "Hello! I am %s and I am %d years old.".formatted(name, age);
        System.out.println(sentence2);
    }
}
