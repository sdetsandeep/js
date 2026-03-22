// 116	116_product_digits.java	Find the product of all digits of a given number.
public class _116_product_digits {
    public static void main(String[] args) {
        int num = 234, product = 1, temp = num;
        while (temp > 0) { product *= temp%10; temp /= 10; }
        System.out.println("Number: " + num + " | Product of digits: " + product);
    }
}
