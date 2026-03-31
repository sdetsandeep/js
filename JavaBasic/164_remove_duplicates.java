// 164	164_remove_duplicates.java	Remove duplicate elements from an array using Set or loops.
import java.util.*;
public class _164_remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,1};
        Set<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Unique: " + set);
    }
}
