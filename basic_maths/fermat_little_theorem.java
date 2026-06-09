package basic_maths;

public class fermat_little_theorem {
    static long M = (long) (1e9 + 7);
    /*
    4 Golden Rules:
    These let you apply modulo before the operation instead of after:
    // Addition
    (a + b) % m = ((a % m) + (b % m)) % m

    // Subtraction
    (a - b) % m = ((a % m) - (b % m) + m) % m  // +m to avoid negative

    // Multiplication
    (a * b) % m = ((a % m) * (b % m)) % m

    // Division → NOT this simple (need Modular Inverse)
    (a / b) % m ≠ (a % m) / (b % m)   ❌

-- Why +m in subtraction?
(2 - 7) % 5
= -5 % 5
= -5  ← wrong! (Java gives negative result)

// Fix:
((2 % 5) - (7 % 5) + 5) % 5
= (2 - 2 + 5) % 5
= 5 % 5
= 0  ✅

Modular Inverse (for Division):

Division in modular arithmetic needs a trick —
instead of dividing by b, multiply by b's modular inverse.

(a / b) % m  =  (a × b⁻¹) % m
b⁻¹ is the modular inverse of b — found using Fermat's Little Theorem:

If m is prime → b⁻¹ = b^(m-2) % m

Why is 10^9 + 7 special?

It is a prime number → modular inverse always exists
Large enough to avoid most collisions
Small enough to fit in int (just barely) and safely in long
(10^9+7)^2 fits in long without overflow


     */
static long factorial(long num){
    if(num == 0 || num==1){
        return 1;
    }
    long fact =1;
    for(int i=1; i<=num; i++){
        fact = (fact * i)%M;
    }
    return fact;
}
static long findPow(long a , long b){
    if(b==0){
        return 1;
    }
    long half = findPow(a,b/2);
    long result = (half * half) % M;
    if(b % 2 ==1){
        result = (a * result)%M;
    }
    return result;
}
    static void main() {
        // Modular nCr using fermat theorem:
        //  nCr = n!/(n-r)! * r!
        // a==n! & b = (n-r)! * r!

        int n = 0,r = 0;
        long a = factorial(n);
        long b = (factorial(n-r)%M * factorial(r)%M)%M;

        long result = (a%M * findPow(b,M-2))%M;   // fermat little theorem
    }
}
