package Binarysearching;

public class Q33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target=2;
        int ans1=leftHalfIndex(nums, target);
        int ans2=rightHalfIndex(nums, target);
        if (ans1!=-1) {
            System.out.println(ans1);
        }else System.out.println(ans2);
    }
    public static int pivot(int[] arr){
        int str=0;
        int end=arr.length-1;
        while (end>str) {
            int mid=str+(end-str)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }else{
                str=mid+1;
            }
        }
        return end;
    }
    public static int leftHalfIndex(int[] arr, int target){
        int str=0;
        int end=pivot(arr);
        while (end>=str) {
            int mid=str+(end-str)/2;
            if (arr[mid]>target) {
                end=mid-1;
            }else if (arr[mid]<target) {
                str=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int rightHalfIndex(int[] arr, int target){
        int str=pivot(arr)+1;
        int end=arr.length-1;
        while (end>=str) {
            int mid=str+(end-str)/2;
            if (arr[mid]>target) {
                end=mid-1;
            }else if (arr[mid]<target) {
                str=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
