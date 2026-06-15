// 76	76_vote_age.java	Check voting eligibility based on age using if-else.
public class _76_vote_age {
    public static void main(String[] args) {
        int age = 16;
        System.out.println("Age: " + age);
        if (age >= 18) System.out.println("You are eligible to vote.");
        else System.out.println("Not eligible. Come back in " + (18 - age) + " year(s).");
    }
}
