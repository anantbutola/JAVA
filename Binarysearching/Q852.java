package Binarysearching;

public class Q852 {
     public static int peakIndexInMountainArray(int[] arr) {
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
    public static void main(String[] args) {
        int [] arr={1,2,3,5,7,6,3,2};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
