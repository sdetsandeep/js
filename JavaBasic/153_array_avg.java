// 153	153_array_avg.java	Find the average of all elements in a given array.
public class _153_array_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Average: " + (double)sum/arr.length);
    }
}
