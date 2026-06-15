// 112	112_multiplication_table.java	Print the multiplication table of a given number up to 10.
public class _112_multiplication_table {
    public static void main(String[] args) {
        int num = 7;
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num*i));
    }
}
