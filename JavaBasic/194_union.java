// 194	194_union.java	Find the union of two arrays (all unique elements from both).
import java.util.*;
public class _194_union {
    public static void main(String[] args) {
        Set<Integer> union=new LinkedHashSet<>(Arrays.asList(1,2,3,4));
        union.addAll(Arrays.asList(3,4,5,6));
        System.out.println("Union: " + union);
    }
}
