// 179	179_find_duplicates.java	Find and print all duplicate elements in an array.
import java.util.*;
public class _179_find_duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1,5,3};
        Set<Integer> seen=new HashSet<>(), dups=new LinkedHashSet<>();
        for (int x:arr) if(!seen.add(x)) dups.add(x);
        System.out.println("Duplicates: " + dups);
    }
}
