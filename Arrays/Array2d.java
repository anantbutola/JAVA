package Arrays;

import java.util.Scanner;

//import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        //Scanner in=new Scanner(System.in);
//        int[][] arr={
//            {1,2,3,4,5},
//            {6,7},
//            {8,9,10,11}
//        };
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j]=in.nextInt();
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        // for(int[] a:arr){
        //     System.out.println(Arrays.toString(a));
        // }
//    System.out.println(arr.length);


        /*
         Jagged Array: Array having rows with differnt columns.
         int[][] arr={
//            {1,2,3,4,5},
//            {6,7},
//            {8,9,10,11}
//        };

            if we want diffrent allocation of columns in different rows:
            int[][] arr = new int[3][];
            arr[0] = new int[2];
            arr[1]= new int[3];
            arr[2] = new int[1];

            means:  rows 0th contains 2 columns, row 1st contains 3 columns, row 3rd contains 1 columns.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter no. of cols in " + i + " row:");
            int col = sc.nextInt();
            arr[i] = new int[col];
        }
        System.out.println("start inputting elements in matrix.");
        for(int i=0; i<rows; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }

        }
//        for loop tarversal:
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+ "  ");
//            }
//            System.out.println();
//        }


        // for each traversal in 2d array
        for(int[] row : arr){
            for (int val: row){
                System.out.println(val + " ");
            }
            System.out.println();
        }


    }

}
