package Binarysearching;

public class Q744 {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='c';
        System.out.println(SmallestLetter(letters,target));
    }
     static char SmallestLetter(char[] letters,char target) {
       int str=0;
       int end=letters.length-1;
       if (target>letters[end]) {
         return letters[0];
       }
       while (end>=str) {
        int mid=str+(end-str)/2;
        if (letters[mid]>target) {
            end=mid-1;
        }else{
            str=mid+1;
        }
       }
       return letters[str];
    }
}
