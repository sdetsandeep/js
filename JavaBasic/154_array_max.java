// 154	154_array_max.java	Find the largest element in an array without using Math.max().
public class _154_array_max {
    public static void main(String[] args) {
        int[] arr = {3, 17, 8, 45, 22, 9};
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        System.out.println("Largest: " + max);
    }
}
