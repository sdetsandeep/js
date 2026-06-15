// 18	18_large_number.java	Store a very large number in a variable and print it.

public class _18_large_number {
    public static void main(String[] args) {
        long largeNum = 9876543210123L;
        System.out.println("Large number (long): " + largeNum);

        // Even larger using BigInteger
        java.math.BigInteger bigNum = new java.math.BigInteger("99999999999999999999999999999");
        System.out.println("Very large number (BigInteger): " + bigNum);
    }
}
