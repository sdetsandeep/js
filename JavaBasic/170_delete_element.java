// 170	170_delete_element.java	Delete an element from a given position in an array using splice().
import java.util.*;
public class _170_delete_element {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Original: " + list);
        int removed = list.remove(2);
        System.out.println("Removed: " + removed + " | After: " + list);
    }
}
