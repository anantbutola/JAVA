package COLLEGE_ASSIGNMENTS;

import java.util.Arrays;
import java.util.Scanner;

public class SameDifferent {
    static Character[] same(String S1, String S2) {
        Character[] arr1 = new Character[S1.length()];
        int index =0;
        for (int i = 0; i < S1.length(); i++) {
            for (int j = 0; j < S2.length(); j++) {
                if (S1.charAt(i) == S2.charAt(j)) {
                   if (!Arrays.asList(arr1).contains(S1.charAt(i))) {
                       arr1[index++] = S1.charAt(i);
                   }
                }
            }
        }
        return arr1;
    }

    static Character[] diff(String S1, String S2) {
        Character[] arr2 = new Character[S1.length()];
        int index=0;
        for (int i = 0; i < S1.length(); i++) {
            boolean find = false;
            for (int j = 0; j < S2.length(); j++) {
                if (S1.charAt(i) == S2.charAt(j)) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                if (!Arrays.asList(arr2).contains(S1.charAt(i))) {
                    arr2[index++] = S1.charAt(i);
                }

            }
        }

        for (int i = 0; i < S2.length(); i++) {
            boolean find = false;
            for (int j = 0; j < S1.length(); j++) {
                if (S2.charAt(i) == S1.charAt(j)) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                if (!Arrays.asList(arr2).contains(S2.charAt(i))) {
                    arr2[index++] = S2.charAt(i);
                }

            }
        }
        return arr2;
    }

    public static void main(String[] args) {
       Scanner sc = new  Scanner(System.in);
        System.out.println("Enter String1 : ");
        String S1 = sc.next();
        System.out.println("Enter String2 : ");
        String S2 = sc.next();

        System.out.println("Identical Characters : "+Arrays.toString(same(S1,S2)));
        System.out.println("Unique Characters : "+Arrays.toString(diff(S1,S2)));
            }
}
