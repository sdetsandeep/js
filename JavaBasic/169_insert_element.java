// 169	169_insert_element.java	Insert an element at a given position in an array using splice().
import java.util.*;
public class _169_insert_element {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,40,50));
        System.out.println("Original: " + list);
        list.add(2, 30);
        System.out.println("After insert 30 at index 2: " + list);
    }
}
