// 178	178_palindrome_arr.java	Check whether a given array reads the same forwards and backwards.
import java.util.Arrays;
public class _178_palindrome_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        boolean isPalin = true;
        for (int i=0;i<arr.length/2;i++) if(arr[i]!=arr[arr.length-1-i]){isPalin=false;break;}
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Is palindrome: " + isPalin);
    }
}
