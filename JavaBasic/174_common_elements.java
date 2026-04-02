// 174	174_common_elements.java	Find common elements between two arrays (intersection).
import java.util.*;
public class _174_common_elements {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5}, arr2={3,4,5,6,7};
        List<Integer> common = new ArrayList<>();
        for (int x:arr1) for (int y:arr2) if(x==y&&!common.contains(x)) common.add(x);
        System.out.println("Common: " + common);
    }
}
