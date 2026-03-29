// 152	152_array_sum.java	Find the sum of all elements in a given array.
public class _152_array_sum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Sum: " + sum);
    }
}
