package Binarysearching;


/*
    This matrix is rowwise and columnwise sorted!
        |10|20|30|40|
        |15|25|35|45|
        |28|29|37|49|
        |33|34|38|50|
 */
import java.util.Arrays;

public class BS2D {
    public static void main(String[] args) {
        int[][] arr={
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
        };
        System.out.println(Arrays.toString(BS(arr,37)));
    }

    public static int[] BS(int[][] arr, int target) {
       int lb=0;   //LowerBound or Rows
       int ub=arr.length-1;   //UpperBound or columns
       while(lb<arr.length&&ub>=0){
        if (arr[lb][ub]==target) {
            return new int[]{lb,ub};
        }else if (arr[lb][ub]>target) {
            ub--;
        }else{
            lb++;
        }
       }
       return new int[]{lb,ub};
    }
    
}
