// 182	182_sum_positive.java	Calculate the sum of only positive numbers in an array.
public class _182_sum_positive {
    public static void main(String[] args) {
        int[] arr = {5,-3,8,-1,12,-7,4};
        int sum = 0;
        for (int x:arr) if(x>0) sum+=x;
        System.out.println("Sum of positives: " + sum);
    }
}
