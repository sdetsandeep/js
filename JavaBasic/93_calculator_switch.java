// 93	93_calculator_switch.java	Create a simple calculator (+, -, *, /) using switch case.
public class _93_calculator_switch {
    public static void main(String[] args) {
        double a = 10, b = 4;
        char operator = '+';
        switch (operator) {
            case '+': System.out.println(a + " + " + b + " = " + (a+b)); break;
            case '-': System.out.println(a + " - " + b + " = " + (a-b)); break;
            case '*': System.out.println(a + " * " + b + " = " + (a*b)); break;
            case '/':
                if (b != 0) System.out.println(a + " / " + b + " = " + (a/b));
                else System.out.println("Error: Division by zero.");
                break;
            default: System.out.println("Invalid operator.");
        }
    }
}
