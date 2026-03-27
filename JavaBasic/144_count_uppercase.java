// 144	144_count_uppercase.java	Count the number of uppercase letters in a given string.
public class _144_count_uppercase {
    public static void main(String[] args) {
        String str = "Hello World JS";
        int count = 0;
        for (char c : str.toCharArray()) if (Character.isUpperCase(c)) count++;
        System.out.println("Uppercase count: " + count);
    }
}
