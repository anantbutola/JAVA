package COLLEGE_ASSIGNMENTS;

import java.util.Scanner;

/*
18. Write a Java program to create and handle a user-defined (custom) exception for invalid
age input (e.g., age < 18).
 */
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomException {
   static  void AgeCheck(int age) throws MyException {
        if(age>=18){
            System.out.println("Your age is "+age);
            System.out.println("Valid Age");
        }else{
            throw new MyException("Age is Less than 18 . Invalid Age");
        }
    }
    public static void main(String[] args) {
     int age;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your age:");
     age = sc.nextInt();
     try{
         AgeCheck(age);
     }catch(MyException me){
         System.out.println(me.getMessage());
        }
    }
}

