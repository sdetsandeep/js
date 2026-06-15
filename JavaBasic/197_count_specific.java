// 197	197_count_specific.java	Count how many times a specific value appears in an array.
public class _197_count_specific {
    public static void main(String[] args) {
        int[] arr = {1,3,3,5,3,7,3}; int val = 3, count = 0;
        for (int x:arr) if(x==val) count++;
        System.out.println(val + " appears " + count + " times.");
    }
}
