package basic_maths;

import java.util.Arrays;
/*
remember:
- initially put all numbers as prime.
- if a number is prime so there factors should not be a prime number.so mark them as not prime.
- therefore lastly only prime numbers available there.

 */
public class SieveOfEratosthenes {

    static void main() {
    int n = 40;
    int count=0;
    boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
    primes[0] = false;  // 0 is not a prime
    primes[1] = false;  // 1 is not a prime
        for(int i=2; i*i <= n ; i++){
            if(primes[i]){
               for(int j = i*2; j<=n; j = j+i){
                   primes[j] = false;
               }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(primes[i]){
                count++;
            }

        }
        System.out.println("No. of primes: "+count);
    }
}
