// 161	161_count_even_arr.java	Count how many even numbers are present in an array.
public class _161_count_even_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int x : arr) if (x%2==0) count++;
        System.out.println("Even count: " + count);
    }
}
