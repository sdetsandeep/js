// 28	28_power_operator.java	Calculate the power of a number using the ** exponentiation operator.

public class _28_power_operator {
    public static void main(String[] args) {
        double base = 2, exponent = 5;
        double result = Math.pow(base, exponent);
        System.out.println("Base: " + (int)base + ", Exponent: " + (int)exponent);
        System.out.println("Result (Math.pow): " + result);
    }
}
