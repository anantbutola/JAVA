package Arrays;

//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Scanner;

public class Array1 {
    public static void reverseArray(int[] array){
           
            for (int i = 0; i < array.length/2; i++) {
            int str=i;
            int lst=array.length-1-i;
             int temp=array[str];
             array[str]=array[lst];
             array[lst]=temp;     
            }
        }
    public static void main(String[] args) {
        //Scanner in=new Scanner(System.in);
       
        int[] arr={23,88,65,12,9,8};
        System.out.println("original array is :"+Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array is :"+Arrays.toString((arr)));
    }

    
}

    //     int[] arr=new int[5];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=in.nextInt();
    //     }
        // for(int a:arr){
    //     //     System.out.print(a);
    //     // }
    //     System.out.println(arr);
    //    System.out.println(Arrays.toString(arr));
     // public static int maxValue(int[] arr){
    //     int num=arr[0];
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i]>num) {
    //             num=arr[i];
    //         }
    //     }
    //     return num;
    // }