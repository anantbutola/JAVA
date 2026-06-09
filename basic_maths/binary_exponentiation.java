package basic_maths;
/*
    Binary Exponentiation or Fast Exponentiation - It powers (a^b) in efficient ways.
    If exponent is even → a^n = a^(n/2) × a^(n/2)
    If exponent is odd → a^n = a × a^(n-1)
 */
public class binary_exponentiation {
    static int findPow(int a, int b){
        if(b==0){           //BAse case
            return 1;
        }
        int half = findPow(a,b/2);       //recursion
        int res = half * half;
        if(b%2==1){                   //check for odd b
            res = res * a;
        }
        return res;
    }
    static void main() {
        int a =2;
        int b = 20;
        System.out.println(findPow(a,b));
    }
}
