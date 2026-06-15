// 171	171_freq_count.java	Count the frequency of each element in an array using an object.
import java.util.*;
public class _171_freq_count {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3,3,4};
        Map<Integer,Integer> freq = new LinkedHashMap<>();
        for (int x:arr) freq.put(x, freq.getOrDefault(x,0)+1);
        for (Map.Entry<Integer,Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " => " + e.getValue() + " times");
    }
}
