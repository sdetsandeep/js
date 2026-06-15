// 19	19_sci_notation.java	Store a number in scientific notation (e.g. 5e6) and print it.

public class _19_sci_notation {
    public static void main(String[] args) {
        double sci1 = 5e6;
        double sci2 = 1.23e-4;
        double sci3 = 6.022e23;

        System.out.println("5e6 = " + sci1);
        System.out.println("1.23e-4 = " + sci2);
        System.out.println("6.022e23 = " + sci3);
        System.out.printf("Scientific format: %.3e%n", sci1);
    }
}
