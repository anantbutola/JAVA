package Arrays.assignments;

import java.util.Arrays;

public class Q1480 {
     public static int[] runningSum(int[] nums) {
     int sum=0;
     int[] ans=new int[nums.length];
     for (int i = 0; i < nums.length; i++) {
        sum=sum+nums[i];
        ans[i]=sum;
     }   
     return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
