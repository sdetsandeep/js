// 15	swap_with_third.java	Swap the values of two variables using a third temporary variable.

public class swap_with_third {
    public static void main(String[] args) {
        int a = 15, b = 25;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
