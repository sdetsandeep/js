// 40	40_fahr_to_celsius.java	Convert temperature from Fahrenheit to Celsius using the formula.
public class _40_fahr_to_celsius {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5.0 / 9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.printf("Celsius: %.2f%n", celsius);
    }
}
