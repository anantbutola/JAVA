package Arrays.assignments;

import java.util.Arrays;

public class Q1920 {
    public static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={5,0,1,2,3,4};
       
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
