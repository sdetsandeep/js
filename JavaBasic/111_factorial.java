// 111	111_factorial.java	Find the factorial of a given number using a loop.
public class _111_factorial {
    public static void main(String[] args) {
        int num = 6;
        long factorial = 1;
        for (int i = 1; i <= num; i++) factorial *= i;
        System.out.println(num + "! = " + factorial);
    }
}
