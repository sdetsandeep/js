// 168	168_rotate_right.java	Rotate an array to the right by one position.
import java.util.Arrays;
public class _168_rotate_right {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original: " + Arrays.toString(arr));
        int last = arr[arr.length-1];
        System.arraycopy(arr, 0, arr, 1, arr.length-1);
        arr[0] = last;
        System.out.println("Rotated right: " + Arrays.toString(arr));
    }
}
