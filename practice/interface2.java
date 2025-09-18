package practice;
import java.util.*;
interface sortable{
      int[] sort(int[] arr,int n);
}
class Bubblesort implements sortable{
   public int[] sort(int[] arr,int n){
        for (int i = 0; i < n-1; i++) {   //no of passes
            for (int j = 0; j < n-1-i; j++) {     //  no of comparisons
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
class Selectionsort implements sortable{
    public int[] sort(int[] arr,int n){

        for (int i = 0; i < n-1; i++) {
            int smallestindx=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[smallestindx]){
                    smallestindx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallestindx];
            arr[smallestindx]=temp;

        }
        return arr;
    }
}
public class interface2 {
    public static void main(String[] args) {
        int[] arr ={9,2,5,1,0,6};
        int  n = arr.length;
        Bubblesort obj1 = new  Bubblesort();
        System.out.println("Before sorting" + Arrays.toString(arr));
        System.out.println("After sorting - bubble" + Arrays.toString(obj1.sort(arr,n)));
        Selectionsort obj2 = new  Selectionsort();
        int[] arr2 ={9,2,5,1,0,6};
        System.out.println("Before sorting" + Arrays.toString(arr2));
        System.out.println("After sorting - selection" + Arrays.toString(obj2.sort(arr2,n)));
    }
}
