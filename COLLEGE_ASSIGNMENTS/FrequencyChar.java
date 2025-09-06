package COLLEGE_ASSIGNMENTS;

import java.util.ArrayList;
import java.util.Scanner;
/*
 ! WAP in Java to initialize a string in order to find that character
 !  which frequency is 2nd most in that string.
*/
public class FrequencyChar {
    static ArrayList<Character> SecondHighestFrequency(String str){
        ArrayList<Character> unique = new ArrayList<>();
        ArrayList<Integer> frequency = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (!unique.contains(ch)) {
                unique.add(ch);
                frequency.add(1);
            }else{
                int index= unique.indexOf(ch);
                frequency.set(index, frequency.get(index)+1);
            }
        }
        int firstfreq = 0;
        int secondfreq=0;
        for (int j = 0; j < frequency.size(); j++) {
             if (frequency.get(j)>firstfreq) {
            secondfreq=firstfreq;
            firstfreq=frequency.get(j);
        }else if (frequency.get(j)<firstfreq && frequency.get(j)>secondfreq) {
            secondfreq=frequency.get(j);
        }
        }
        ArrayList<Character> chrs= new ArrayList<>();
       for (int i = 0; i < frequency.size(); i++) {
        
        if (frequency.get(i) == secondfreq) {
            chrs.add(unique.get(i));
        }
       }
       return chrs;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the string : ");
     String str = sc.next();
     System.out.println("2nd Highest Frequency characters in string : "+ SecondHighestFrequency(str));
    }
}
