// 103	103_subject_code.java	Display subject name based on a subject code using switch.
public class _103_subject_code {
    public static void main(String[] args) {
        String code = "CS101";
        switch (code) {
            case "CS101": System.out.println("Introduction to Computer Science"); break;
            case "MA101": System.out.println("Mathematics I"); break;
            case "PH101": System.out.println("Physics I"); break;
            case "EN101": System.out.println("English Communication"); break;
            default: System.out.println("Subject not found.");
        }
    }
}
