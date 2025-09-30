package sildingWindow;
/*
arr[]={}; given in which we have to find length of subarray condition is that that sum of that part of subarray
          should be smaller than equal to given value k.Return maxlength.
 */
public class LongestSubarrayLength {
    static int bruteforce(int[] arr,int size,int k){
        int maxlen=0;
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum=0;
            for (int j = i; j < size; j++) {
                sum=sum+arr[j];
                if(sum<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }

        return maxlen;
    }

    static int optimized(int[] arr,int size,int k){
        int l=0,r=0;
        int sum=0;
        int maxlen=0;
        while(r<size){
            sum=sum+arr[r];
            while(sum>k ){
                sum=sum-arr[l];
                l++;
            }
            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,7,9,10};
        int size=arr.length;
        int k=6;
        System.out.println("max length of subarray using optimized solution is "+optimized(arr,size,k));
        System.out.println("max length of subarray using bruteforce is "+bruteforce(arr,size,k));
    }
}
