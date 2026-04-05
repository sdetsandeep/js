// 190	190_mode_array.java	Find the mode (most frequently occurring element) of an array.
import java.util.*;
public class _190_mode_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5,3};
        Map<Integer,Integer> freq = new HashMap<>();
        for (int x:arr) freq.put(x, freq.getOrDefault(x,0)+1);
        int mode=arr[0], maxF=0;
        for (Map.Entry<Integer,Integer> e:freq.entrySet()) if(e.getValue()>maxF){maxF=e.getValue();mode=e.getKey();}
        System.out.println("Mode: " + mode + " (appears " + maxF + " times)");
    }
}
