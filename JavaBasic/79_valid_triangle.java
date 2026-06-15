// 79	79_valid_triangle.java	Check whether a triangle is valid given its three sides.
public class _79_valid_triangle {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 10;
        System.out.println("Sides: " + a + ", " + b + ", " + c);
        if (a+b > c && b+c > a && a+c > b) System.out.println("Valid Triangle.");
        else System.out.println("NOT a Valid Triangle.");
    }
}
