// 59	59_compare_ages.java	Compare ages of two people and print who is older.
public class _59_compare_ages {
    public static void main(String[] args) {
        String name1 = "Alice"; int age1 = 25;
        String name2 = "Bob";   int age2 = 30;
        System.out.println(name1 + ": " + age1 + ", " + name2 + ": " + age2);
        if (age1 > age2) System.out.println(name1 + " is older.");
        else if (age2 > age1) System.out.println(name2 + " is older.");
        else System.out.println("Both are same age.");
    }
}
