package strings;

import java.util.ArrayList;

/*
  Given a string s, find the length of the longest substring without duplicate characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
       int left,right=0;
       String str="pwwkew";
       StringBuilder window=new StringBuilder();
       window.append(str.charAt(0));
       for (int i = 0; i < str.length()-1; i++) {
           if (str.charAt(i) != str.charAt(i+1)) {
               right++;
               
           } 
       }
    }
}
