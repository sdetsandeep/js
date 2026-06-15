// 159	159_sort_desc.java	Sort an array of numbers in descending order.
import java.util.Arrays;
import java.util.Collections;
public class _159_sort_desc {
    public static void main(String[] args) {
        Integer[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr));
    }
}
