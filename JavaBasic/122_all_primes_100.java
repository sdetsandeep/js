// 122	122_all_primes_100.java	Print all prime numbers from 1 to 100.
public class _122_all_primes_100 {
    public static void main(String[] args) {
        System.out.print("Primes 1-100: ");
        for (int n = 2; n <= 100; n++) {
            boolean p = true;
            for (int i = 2; i <= Math.sqrt(n); i++) if(n%i==0){p=false;break;}
            if (p) System.out.print(n + " ");
        }
        System.out.println();
    }
}
