package Binarysearching;

public class CeilingNumber {
    public static void main(String[] args) {
        int [] arr={2,4,5,12,22,34,66,88,96};
        int target=15;
        int ans=ceiling(arr,target);
        System.out.println(arr[ans]);
    }

     static int ceiling(int[] arr, int target) {
       int str=0;
       int end=arr.length-1;
      while (end>=str) {
        int mid=str+(end-str)/2;
        if (arr[mid]==target) {
            return mid;
        }else if (arr[mid]>target) {
            end=mid-1;
        }else{
            str=mid+1;
        }
      }
      return str;
    }
}
