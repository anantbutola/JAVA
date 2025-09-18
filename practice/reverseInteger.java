package practice;

import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        boolean isnegative = (num>0)?false:true;
        if(isnegative){
            num = num *-1;
        }
        int rev=0;

        while(num>0){
            int temp = num %10;
            rev = rev *10 + temp;
            num= num/10;
        }

        if(isnegative){
            rev = rev *-1;
        }
        System.out.println("The reversed number is : "+rev);
        if (rev == original){
            System.out.println("Palindrome: "+ true);
        }else {
            System.out.println("Palindrome: "+ false);
        }

    }
}
