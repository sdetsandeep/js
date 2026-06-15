// 141	141_count_words.java	Count the number of words in a given sentence.
public class _141_count_words {
    public static void main(String[] args) {
        String str = "Java is fun to learn";
        String[] words = str.trim().split("\\s+");
        System.out.println("String: " + str);
        System.out.println("Words: " + words.length);
    }
}
