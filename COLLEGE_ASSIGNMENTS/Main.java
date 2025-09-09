package COLLEGE_ASSIGNMENTS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String:");
        String str2 =sc.nextLine() ;

        String common = "";
        String different = "";


        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1 && common.indexOf(ch) == -1) {
                common += ch;
            }
        }


        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1 && different.indexOf(ch) == -1) {
                different += ch;
            }
        }


        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (str1.indexOf(ch) == -1 && different.indexOf(ch) == -1) {
                different += ch;
            }
        }

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Common characters: " + common);
        System.out.println("Different characters: " + different );
    }
}
