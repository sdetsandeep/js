// 193	193_intersection.java	Find the intersection of two arrays (common elements, no duplicates).
import java.util.*;
public class _193_intersection {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,2,3,4));
        Set<Integer> s2=new HashSet<>(Arrays.asList(2,3,3,5));
        s1.retainAll(s2);
        System.out.println("Intersection: " + s1);
    }
}
