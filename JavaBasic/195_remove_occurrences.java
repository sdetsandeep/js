// 195	195_remove_occurrences.java	Remove all occurrences of a given value from an array.
import java.util.*;
public class _195_remove_occurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5}; int val = 2;
        List<Integer> result = new ArrayList<>();
        for (int x:arr) if(x!=val) result.add(x);
        System.out.println("After removing " + val + ": " + result);
    }
}
