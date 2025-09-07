package COLLEGE_ASSIGNMENTS;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonDifferentChar {
    static ArrayList<Character> CommonChars(String S1, String S2) {
        ArrayList<Character> common = new ArrayList<>();
        for (int i = 0; i < S1.length(); i++) {
            for (int j = 0; j < S2.length(); j++) {
                if (S1.charAt(i) == S2.charAt(j)) {
                    if (!common.contains(S1.charAt(i))) {
                        common.add(S1.charAt(i));
                    }
                }
            }
        }
        return common;
    }

    static ArrayList<Character> DifferentChars(String S1, String S2) {
        ArrayList<Character> different = new ArrayList<>();
        for (int i = 0; i < S1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < S2.length(); j++) {
                if (S1.charAt(i) == S2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                if (!different.contains(S1.charAt(i))) {
                    different.add(S1.charAt(i));
                }
            }
        }
        for (int i = 0; i < S2.length(); i++) {
            boolean found = false;
            for (int j = 0; j < S1.length(); j++) {
                if (S2.charAt(i) == S1.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                if (!different.contains(S2.charAt(i))) {
                    different.add(S2.charAt(i));
                }
            }
        }
        return different;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String :");
        String S1 = sc.next();
        System.out.print("Enter 2nd String :");
        String S2 = sc.next();

        System.out.println("Common characters are :" + CommonChars(S1, S2));
        System.out.println("Different characters are :" + DifferentChars(S1, S2));
    }
}
