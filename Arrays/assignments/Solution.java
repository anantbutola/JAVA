package Arrays.assignments;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        String original=Integer.toString(x);
        String reversed=new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
       
    }
    public static void main(String[] args) {
        int x=678;
         
        System.out.println(isPalindrome(x));
    }
}