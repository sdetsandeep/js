// 173	173_max_diff.java	Find the maximum difference between any two elements in an array.
public class _173_max_diff {
    public static void main(String[] args) {
        int[] arr = {2,7,3,10,1,8};
        int max=arr[0], min=arr[0];
        for (int x:arr) { if(x>max)max=x; if(x<min)min=x; }
        System.out.println("Max difference: " + (max-min));
    }
}
