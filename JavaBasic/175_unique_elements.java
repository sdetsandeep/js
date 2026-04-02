// 175	175_unique_elements.java	Find elements that appear only in one of two given arrays.
import java.util.*;
public class _175_unique_elements {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> l2=new ArrayList<>(Arrays.asList(3,4,5,6,7));
        List<Integer> onlyIn1=new ArrayList<>(l1); onlyIn1.removeAll(l2);
        List<Integer> onlyIn2=new ArrayList<>(l2); onlyIn2.removeAll(l1);
        System.out.println("Only in arr1: " + onlyIn1);
        System.out.println("Only in arr2: " + onlyIn2);
    }
}
