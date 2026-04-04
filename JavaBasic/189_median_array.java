// 189	189_median_array.java	Find the median value of a sorted array.
import java.util.Arrays;
public class _189_median_array {
    public static void main(String[] args) {
        int[] arr = {3,7,2,9,5};
        Arrays.sort(arr);
        int mid = arr.length/2;
        double median = arr.length%2!=0 ? arr[mid] : (arr[mid-1]+arr[mid])/2.0;
        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Median: " + median);
    }
}
