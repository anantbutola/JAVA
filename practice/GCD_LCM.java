package practice;
import java.util.*;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = Math.max(a, b);
        while (big>0) {
            if (big%a ==0 && big % b ==0){
                break;
            }
            big++;
        }
        System.out.println("LCM = "+big);
        int hcf =(a *b)/big;
        System.out.println("HCF = "+hcf);
    }


}
