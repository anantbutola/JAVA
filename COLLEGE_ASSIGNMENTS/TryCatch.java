package COLLEGE_ASSIGNMENTS;

import java.util.Scanner;

/*
17. Write a Java program to demonstrate the use of try, catch, and finally blocks.
 */
public class TryCatch {
    public static void main(String[] args) {
        int a ,b ,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 'a': ");
        a = sc.nextInt();
        System.out.print("Enter number 'b': ");
        b = sc.nextInt();
        try{
            c = a / b;
            System.out.println("Division of a and b is "+ c);
        }catch(ArithmeticException ae){
            System.out.println("Exception: "+ ae.getMessage());
        }finally {
            System.out.println("Finally Block executed");
        }
    }
}
