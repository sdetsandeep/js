// 172	172_is_sorted.java	Check whether a given array is sorted in ascending order.
public class _172_is_sorted {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        boolean sorted = true;
        for (int i=0;i<arr.length-1;i++) if(arr[i]>arr[i+1]){sorted=false;break;}
        System.out.println("Is sorted ascending: " + sorted);
    }
}
