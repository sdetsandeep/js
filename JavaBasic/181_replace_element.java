// 181	181_replace_element.java	Replace an element at a specific position in an array.
import java.util.Arrays;
public class _181_replace_element {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Original: " + Arrays.toString(arr));
        arr[2] = 99;
        System.out.println("After replacing index 2 with 99: " + Arrays.toString(arr));
    }
}
