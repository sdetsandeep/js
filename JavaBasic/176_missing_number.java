// 176	176_missing_number.java	Find the missing number in an array containing 1 to n with one gap.
public class _176_missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length+1, expected = n*(n+1)/2, actual = 0;
        for (int x:arr) actual+=x;
        System.out.println("Missing number: " + (expected-actual));
    }
}
