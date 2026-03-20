// 104	104_language_option.java	Display a language name based on a number option using switch.
public class _104_language_option {
    public static void main(String[] args) {
        int option = 3;
        switch (option) {
            case 1: System.out.println("JavaScript"); break;
            case 2: System.out.println("Python"); break;
            case 3: System.out.println("Java"); break;
            case 4: System.out.println("C++"); break;
            case 5: System.out.println("Rust"); break;
            default: System.out.println("Invalid. Choose 1-5.");
        }
    }
}
