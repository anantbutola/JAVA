package COLLEGE_ASSIGNMENTS;


import java.util.Arrays;
import java.util.Scanner;

public class AverageRow2D {
    static float Average(int[][] arr ,int row){
        float sum =0;
         for (int col = 0; col < arr[row].length; col++) {
            sum += arr[row][col];
         }
         float average = sum / arr[row].length;

         return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows= sc.nextInt();
        System.out.print("Enter columns : ");
        int cols = sc.nextInt();
        int[][] arr =new int[rows][cols];
        System.out.println("Enter elements on array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix :");
        for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]));     
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Average of Row : "+(i+1)+" is : "+Average(arr, i));
        }
    }
}
