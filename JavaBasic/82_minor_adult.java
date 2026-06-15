// 82	82_minor_adult.java	Check if a person is a minor (<18) or an adult (>=18).
public class _82_minor_adult {
    public static void main(String[] args) {
        int age = 15;
        System.out.println("Age: " + age);
        if (age >= 18) System.out.println("Adult.");
        else System.out.println("Minor.");
    }
}
