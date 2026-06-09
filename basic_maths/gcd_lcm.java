package basic_maths;

public class gcd_lcm {
    //using Euclidean algorithm we're finding gcd:
        /*
        algo simply says that:
        gcd(a,b) --> gcd(b,a%b)

         */
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a , int b){
        int gcd = gcd(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }
    static void main() {

    int a=12;
    int b=16;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}
