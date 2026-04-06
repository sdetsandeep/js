// 196	196_zeros_to_end.java	Move all zeros in an array to the end while keeping other order intact.
import java.util.*;
public class _196_zeros_to_end {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,0,7};
        List<Integer> nonZero=new ArrayList<>(), zeros=new ArrayList<>();
        for (int x:arr) if(x!=0) nonZero.add(x); else zeros.add(x);
        nonZero.addAll(zeros);
        System.out.println("Zeros to end: " + nonZero);
    }
}
