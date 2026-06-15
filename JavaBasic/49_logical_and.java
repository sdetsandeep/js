// 49	49_logical_and.java	Use logical AND (&&) to check if both conditions are true.
public class _49_logical_and {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;
        System.out.println("Age: " + age + ", Has ID: " + hasID);
        System.out.println("age >= 18 && hasID: " + (age >= 18 && hasID));
        System.out.println("age >= 30 && hasID: " + (age >= 30 && hasID));
    }
}
