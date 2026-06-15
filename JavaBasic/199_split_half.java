// 199	199_split_half.java	Split an array into two equal halves and print both.
import java.util.Arrays;
public class _199_split_half {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int mid = arr.length/2;
        System.out.println("First half: " + Arrays.toString(Arrays.copyOfRange(arr,0,mid)));
        System.out.println("Second half: " + Arrays.toString(Arrays.copyOfRange(arr,mid,arr.length)));
    }
}
