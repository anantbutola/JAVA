package COLLEGE_ASSIGNMENTS;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyCheck {
    static Character[] SecondFreq(String S1){
        Character[] unique = new Character[S1.length()];
        int[] freq = new int[S1.length()];

        for (int i = 0; i < S1.length(); i++) {
            char ch = S1.charAt(i);
            if (!Arrays.asList(unique).contains(ch)) {
                unique[i] = ch;
                freq[i] = 1;
            }else {
                int value = S1.indexOf(ch);
                freq[value]++;

            }
        }
        int firstfreq = 0;
        int secondfreq=0;
        for (int k : freq) {
            if (k > firstfreq) {
                secondfreq = firstfreq;
                firstfreq = k;
            } else if (k < firstfreq && k > secondfreq) {
                secondfreq = k;
            }
        }
        Character[] arr = new  Character[unique.length];
        int index=0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==secondfreq) {
                arr[index++]=unique[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("2nd Highest Frequency characters in string : "+ Arrays.toString(SecondFreq(str)));
    }
}
