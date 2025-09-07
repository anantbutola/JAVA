package Binarysearching;

import java.util.Arrays;

public class Q34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        ans[0]=Index1(nums, target);
        ans[1]=Index2(nums, target);
        return ans;
    }
    //initial index of target element
    public static int Index1(int[] nums, int target) {
       int ans=-1;
       int str=0;
       int end=nums.length-1;
       while (end>=str) {
        int mid=str+(end-str)/2;
        if (nums[mid]>target) {
            end=mid-1;
        }else if (nums[mid]<target) {
            str=mid+1;
        }else{
            ans=mid;
            end=mid-1;
        }
       }
       return ans;
    }
    //last index of target elemnet
    public static int Index2(int[] nums, int target) {
       int ans=-1;
       int str=0;
       int end=nums.length-1;
       while (end>=str) {
        int mid=str+(end-str)/2;
        if (nums[mid]>target) {
            end=mid-1;
        }else if (nums[mid]<target) {
            str=mid+1;
        }else{
            ans=mid;
            str=mid+1;
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,10};
        int target=99;
        int []ans=searchRange(nums,target);
        System.out.println("Required Index is:"+Arrays.toString(ans));
    }
}
