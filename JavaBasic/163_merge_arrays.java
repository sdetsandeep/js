// 163	163_merge_arrays.java	Merge two arrays into one using concat() or spread operator.
import java.util.Arrays;
public class _163_merge_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {4,5,6};
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        System.out.println("Merged: " + Arrays.toString(merged));
    }
}
