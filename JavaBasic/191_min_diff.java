// 191	191_min_diff.java	Find the minimum difference between any two elements in an array.
import java.util.Arrays;
public class _191_min_diff {
    public static void main(String[] args) {
        int[] arr = {1,5,3,19,18,25};
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i=0;i<arr.length-1;i++) minDiff=Math.min(minDiff,arr[i+1]-arr[i]);
        System.out.println("Min difference: " + minDiff);
    }
}
