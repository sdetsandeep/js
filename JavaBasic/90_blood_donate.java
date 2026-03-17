// 90	90_blood_donate.java	Determine whether a person can donate blood based on age and weight.
public class _90_blood_donate {
    public static void main(String[] args) {
        int age = 22; double weight = 55;
        System.out.println("Age: " + age + ", Weight: " + weight + " kg");
        if (age >= 18 && age <= 65 && weight >= 50) System.out.println("Eligible to donate blood.");
        else System.out.println("NOT eligible to donate blood.");
    }
}
