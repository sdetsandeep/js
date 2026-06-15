// 162	162_count_odd_arr.java	Count how many odd numbers are present in an array.
public class _162_count_odd_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int x : arr) if (x%2!=0) count++;
        System.out.println("Odd count: " + count);
    }
}
