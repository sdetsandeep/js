// 167	167_rotate_left.java	Rotate an array to the left by one position.
import java.util.Arrays;
public class _167_rotate_left {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original: " + Arrays.toString(arr));
        int first = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length-1);
        arr[arr.length-1] = first;
        System.out.println("Rotated left: " + Arrays.toString(arr));
    }
}
