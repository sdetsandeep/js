// 192	192_max_product.java	Find the maximum product of any two elements in an array.
import java.util.Arrays;
public class _192_max_product {
    public static void main(String[] args) {
        int[] arr = {1,10,2,6,5,3};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("Max product: " + arr[n-1]*arr[n-2]);
    }
}
