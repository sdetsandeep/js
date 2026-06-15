// 160	160_search_element.java	Search for a specific element in an array and print its index.
public class _160_search_element {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 70, 90};
        int target = 50, index = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i]==target) { index=i; break; }
        System.out.println("Target " + target + (index!=-1 ? " found at index: "+index : " not found."));
    }
}
