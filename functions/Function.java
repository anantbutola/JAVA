package functions;
import java.util.*;
public class Function {
    public static void Factorial(int n){
        int fact=1;
        if (n==1 || n==0) {
            System.out.println("Factorial is 1");
        }else{
            for(int i=n;i>=1;i--){
              fact= fact*i;
            }
        }
           System.out.println("Factorial of no. is :"+fact);
 }
    public static void main(String[] args){
        System.out.print("Enter no. :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       Factorial(num);
       sc.close();
    }
}
