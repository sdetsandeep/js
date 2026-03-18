// 94	94_grade_switch.java	Display grade (A/B/C/D/F) using switch case on marks range.
public class _94_grade_switch {
    public static void main(String[] args) {
        int marks = 82;
        System.out.println("Marks: " + marks);
        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 75) System.out.println("Grade: B");
        else if (marks >= 60) System.out.println("Grade: C");
        else if (marks >= 40) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}
