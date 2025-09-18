package practice;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr1= new int[n][m];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        int sum  = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    if ( i==j || (i+j)== (arr1.length-1) ){
                        sum += arr1[i][j];
                    }
                }
        }
        System.out.println("The sum of the diagonal matrix is : "+sum);
    }
}
