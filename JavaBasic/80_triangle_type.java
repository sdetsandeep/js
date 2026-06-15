// 80	80_triangle_type.java	Determine the type of triangle: equilateral, isosceles, or scalene.
public class _80_triangle_type {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 8;
        System.out.println("Sides: " + a + ", " + b + ", " + c);
        if (a==b && b==c) System.out.println("Equilateral Triangle.");
        else if (a==b || b==c || a==c) System.out.println("Isosceles Triangle.");
        else System.out.println("Scalene Triangle.");
    }
}
