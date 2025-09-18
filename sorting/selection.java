package sorting;

import java.util.Arrays;

public class selection {
    static int[] select(int[] arr ,int n){
        for (int i = 0; i < n-1; i++) {
            int smallestindx=i;
            for (int j = i+1; j < n; j++) {
               if (arr[j]<arr[smallestindx]){
                   smallestindx=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[smallestindx];
            arr[smallestindx]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={9,1,3,6,2};
        int n = arr.length;;
        System.out.println(Arrays.toString(arr));
        select(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
