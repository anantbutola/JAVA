package Arrays.assignments;

import java.util.Arrays;

public class Q1929 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[n * 2];
        for (int i = 0; i < ans.length; i++) {
            if (i<=nums.length-1) {
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-n];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
