// 121	121_is_prime.java	Check whether a given number is prime or not.
public class _121_is_prime {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = num >= 2;
        for (int i = 2; i <= Math.sqrt(num); i++) { if(num%i==0){ isPrime=false; break; } }
        System.out.println("Number: " + num);
        System.out.println(num + (isPrime ? " is Prime." : " is NOT Prime."));
    }
}
