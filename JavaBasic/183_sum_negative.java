// 183	183_sum_negative.java	Calculate the sum of only negative numbers in an array.
public class _183_sum_negative {
    public static void main(String[] args) {
        int[] arr = {5,-3,8,-1,12,-7,4};
        int sum = 0;
        for (int x:arr) if(x<0) sum+=x;
        System.out.println("Sum of negatives: " + sum);
    }
}
