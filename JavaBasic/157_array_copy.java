// 157	157_array_copy.java	Copy one array into another array.
import java.util.Arrays;
public class _157_array_copy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
    }
}
