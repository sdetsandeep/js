// 166	166_second_smallest.java	Find the second smallest element in an array.
public class _166_second_smallest {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,2};
        int min=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        for (int x:arr) { if(x<min){second=min;min=x;} else if(x<second&&x!=min) second=x; }
        System.out.println("Second smallest: " + second);
    }
}
