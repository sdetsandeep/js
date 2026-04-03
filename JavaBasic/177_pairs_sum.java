// 177	177_pairs_sum.java	Find all pairs of elements in an array that add up to a given sum.
public class _177_pairs_sum {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,4,2}; int target = 8;
        System.out.println("Pairs summing to " + target + ":");
        for (int i=0;i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target) System.out.println("("+arr[i]+", "+arr[j]+")");
    }
}
