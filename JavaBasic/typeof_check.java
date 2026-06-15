// 9	typeof_check.java	Use typeof operator to print the data type of different variables.

public class typeof_check {
    public static void main(String[] args) {
        // Java uses getClass().getSimpleName() or explicit type names
        int num = 10;
        double decimal = 3.14;
        String text = "Hello";
        boolean flag = true;
        char ch = 'A';

        System.out.println("num: " + num + " -> Type: int");
        System.out.println("decimal: " + decimal + " -> Type: double");
        System.out.println("text: " + text + " -> Type: " + text.getClass().getSimpleName());
        System.out.println("flag: " + flag + " -> Type: boolean");
        System.out.println("ch: " + ch + " -> Type: char");
    }
}
