// 186	186_flatten_array.java	Flatten a nested array into a single-level array using flat() or recursion.
import java.util.*;
public class _186_flatten_array {
    static void flatten(Object[] arr, List<Integer> result) {
        for (Object o : arr) {
            if (o instanceof Object[]) flatten((Object[])o, result);
            else result.add((Integer)o);
        }
    }
    public static void main(String[] args) {
        Object[] nested = {1, new Object[]{2,3}, new Object[]{4, new Object[]{5,6}}, 7};
        List<Integer> flat = new ArrayList<>();
        flatten(nested, flat);
        System.out.println("Flattened: " + flat);
    }
}
