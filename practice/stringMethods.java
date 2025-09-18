package practice;

import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        String str = "anant";
        String str1 = "Anant";
        String str2="hello %s age is %d";
        char[] arr = {'a','b','c','d','e'};
        //System.out.println(String.copyValueOf(arr));
       // System.out.println(String.format(str2,"india",20));
//        System.out.println(Arrays.toString(str.getBytes()));
//        str1.getChars(0,5,arr,0);
//        System.out.println(Arrays.toString(arr));
//        String nayi =String.join("----","butola","ram" );
//        System.out.println(nayi);
//        String nayi = str1.replace('n','b');
//        System.out.println(nayi);
//        String nayi = str1.replaceAll("an","tn");
//        System.out.println(nayi);
        String str3 ="hi my name is anant and i live in srinagar past 2 years";
        System.out.println(str3.replaceAll("\\D","twenty"));
        //System.out.println(Arrays.toString(str3.split("\\s")));

//        String str4 ="Hello123";
//        String str5 ="Anant898";
//        System.out.println(str4.matches("[A-Za-z0-9]+"));


    }

}
