// 56	56_driving_license.java	Check if a person can apply for a driving license based on age.
public class _56_driving_license {
    public static void main(String[] args) {
        int age = 17;
        System.out.println("Age: " + age);
        if (age >= 18) System.out.println("Can apply for driving license.");
        else System.out.println("Cannot apply. Minimum age is 18.");
    }
}
