// 62	62_pos_neg.java	Check whether a number is positive, negative, or zero.
public class _62_pos_neg {
    public static void main(String[] args) {
        int num = -5;
        System.out.println("Number: " + num);
        if (num > 0) System.out.println("Positive.");
        else if (num < 0) System.out.println("Negative.");
        else System.out.println("Zero.");
    }
}
