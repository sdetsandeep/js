// 187	187_reverse_no_method.java	Reverse an array without using the built-in reverse() method.
import java.util.Arrays;
public class _187_reverse_no_method {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original: " + Arrays.toString(arr));
        int[] rev = new int[arr.length];
        for (int i=0;i<arr.length;i++) rev[i]=arr[arr.length-1-i];
        System.out.println("Reversed: " + Arrays.toString(rev));
    }
}
