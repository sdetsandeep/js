// 165	165_second_largest.java	Find the second largest element in an array.
import java.util.*;
public class _165_second_largest {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};
        int max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for (int x:arr) { if(x>max){second=max;max=x;} else if(x>second&&x!=max) second=x; }
        System.out.println("Second largest: " + second);
    }
}
