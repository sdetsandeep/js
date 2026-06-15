// 85	85_absolute_val.java	Find the absolute value of a number without using Math.abs().
public class _85_absolute_val {
    public static void main(String[] args) {
        int num = -42;
        int absolute = (num < 0) ? -num : num;
        System.out.println("Number: " + num);
        System.out.println("Absolute Value: " + absolute);
    }
}
