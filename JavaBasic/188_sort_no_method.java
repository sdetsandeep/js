// 188	188_sort_no_method.java	Sort an array without using the built-in sort() method (bubble sort).
import java.util.Arrays;
public class _188_sort_no_method {
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        for (int i=0;i<arr.length-1;i++)
            for (int j=0;j<arr.length-i-1;j++)
                if(arr[j]>arr[j+1]){int t=arr[j];arr[j]=arr[j+1];arr[j+1]=t;}
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
    }
}
