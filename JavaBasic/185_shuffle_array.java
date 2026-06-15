// 185	185_shuffle_array.java	Shuffle an array randomly using the Fisher-Yates algorithm.
import java.util.*;
public class _185_shuffle_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Random rand = new Random();
        for (int i=arr.length-1;i>0;i--) {
            int j=rand.nextInt(i+1); int t=arr[i]; arr[i]=arr[j]; arr[j]=t;
        }
        System.out.println("Shuffled: " + Arrays.toString(arr));
    }
}
