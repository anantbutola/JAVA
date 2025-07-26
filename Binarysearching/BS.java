package Binarysearching;

public class BS {

    public static void main(String[] args) {
        int[] arr={2,4,5,7,9,11,15,19,22};
        int target=19;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);

    }

     static int BinarySearch(int[] arr, int target) {
        int str=0;
        int end=arr.length -1;
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
        return -1;
    }
}
