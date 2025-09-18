package practice;

import java.util.*;

public class multiplicationmatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of matrix for multiplication");
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 =  new int[k][l];
        int[][] arr2 = new int[l][m];
        System.out.println("1st array elements :");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("2nd array elements :");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] arr3 = new int[k][m];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                for (int k1 = 0; k1 < m; k1++) {
                     arr3[i][j] += arr1[i][k1]  * arr2[k1][j];
                }
            }
        }
        System.out.println("1st array  :");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("2nd array  :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        System.out.println("3rd array  :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
