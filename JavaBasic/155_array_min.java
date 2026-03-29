// 155	155_array_min.java	Find the smallest element in an array without using Math.min().
public class _155_array_min {
    public static void main(String[] args) {
        int[] arr = {3, 17, 8, 45, 22, 9};
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        System.out.println("Smallest: " + min);
    }
}
