package Binarysearching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=11;
        System.out.println(ans(arr, target));
    }
    static int search(int[] arr,int target,int str,int end){
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
    static int ans(int[] arr,int target){
      
      int str=0;
      int end=1;
      while (target>arr[end]) {
        int newstr=end+1;
        end=end+(end-str+1)*2;
        str=newstr;
      }
      return search(arr, target, str, end);
    }
}
