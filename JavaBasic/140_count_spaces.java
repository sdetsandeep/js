// 140	140_count_spaces.java	Count the number of spaces in a given sentence using a loop.
public class _140_count_spaces {
    public static void main(String[] args) {
        String str = "Java is fun to learn";
        int count = 0;
        for (char c : str.toCharArray()) if (c == ' ') count++;
        System.out.println("Spaces: " + count);
    }
}
