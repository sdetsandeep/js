// 184	184_separate_even_odd.java	Separate even and odd elements of an array into two different arrays.
import java.util.*;
public class _184_separate_even_odd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        List<Integer> evens=new ArrayList<>(), odds=new ArrayList<>();
        for (int x:arr) if(x%2==0) evens.add(x); else odds.add(x);
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);
    }
}
