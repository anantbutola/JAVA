package sorting;
import java.util.*;
public class bubblesort {
    static int[] sort(int[] arr , int n){
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j] ;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={9,1,3,6,2};
        int n = arr.length;;
        System.out.println(Arrays.toString(arr));
        sort(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
