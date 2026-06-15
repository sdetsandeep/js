// 75	75_grade_assign.java	Assign grade A/B/C/D/F to a student based on their marks.
public class _75_grade_assign {
    public static void main(String[] args) {
        int marks = 78;
        System.out.println("Marks: " + marks);
        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 75) System.out.println("Grade: B");
        else if (marks >= 60) System.out.println("Grade: C");
        else if (marks >= 40) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}
