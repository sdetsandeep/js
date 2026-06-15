// 158	158_sort_asc.java	Sort an array of numbers in ascending order.
import java.util.Arrays;
public class _158_sort_asc {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));
    }
}
