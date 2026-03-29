// 156	156_array_reverse.java	Reverse an array using the built-in reverse() method.
import java.util.Arrays;
import java.util.Collections;
public class _156_array_reverse {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
