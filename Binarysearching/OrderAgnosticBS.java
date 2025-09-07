package Binarysearching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
         //int[] arr={2,4,5,7,9,11,15,19,22};
         int[] arr={22,19,15,11,9,7,5,4,2};
        int target=19;
        int ans=BS(arr,target);
        System.out.println(ans);
    }

        static int BS(int[] arr, int target) {
        int str=0;
        int end=arr.length -1;
        boolean asc;
            asc= arr[str] < arr[end];
        if (asc) {
            while (str<=end) {
            int mid=str+(end-str)/2;
            if (arr[mid]==target) {
                return mid;
            }else if (arr[mid]>target) {
                end=mid-1;
            }else{
                str=mid+1;
            }
        }
        }else{
            while (str<=end) {
            int mid=str+(end-str)/2;
            if (arr[mid]==target) {
                return mid;
            }else if (arr[mid]>target) {
                str=mid+1;
            }else{
                end=mid-1;
            }
        }
        }
        return -1;
    }

}
 