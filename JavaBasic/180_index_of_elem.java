// 180	180_index_of_elem.java	Find the index of a specific element in an array using indexOf().
import java.util.*;
public class _180_index_of_elem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15,30,45,60,75);
        int elem = 45;
        System.out.println("Index of " + elem + ": " + list.indexOf(elem));
    }
}
