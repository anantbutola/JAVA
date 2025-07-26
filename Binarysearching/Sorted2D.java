package Binarysearching;

import java.util.Arrays;

/*
    This matrix is rowwise and columnwise sorted!
        |1 | 2| 3| 4|
        |5 | 6| 7| 8|
        |9 |10|11|12|
        |13|14|15|16|
 */

public class Sorted2D {
    public static void main(String[] args) {
int[][] matrix={
    {1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16}
};
int target=15;
  System.out.println(Arrays.toString(search(matrix, target)));

    }

    static int[] BS(int matrix[][], int target, int row, int Cstrt, int Cend) {
        while (Cstrt <= Cend) {
            int mid = Cstrt + (Cend - Cstrt) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] > target) {
                Cstrt = mid + 1;
            } else {
                Cend = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            BS(matrix, target, 0, 0, cols - 1);
        }
        int Rstrt=0;
        int Rend=rows-1;
        int Cmid=cols/2;
         //run the loop till we found  2 rows
         while (Rstrt<Rend-1) {
            int mid=Rstrt+(Rend-Rstrt)/2;
            if (matrix[mid][Cmid]==target) {
                return new int[]{mid,Cmid}; 
            }else if (matrix[mid][Cmid]>target) {
                Rend=mid;
            }else{
                Rstrt=mid;
            }
         }
         //Now we have Two rows
         //for first ele in mid column
         if (matrix[Rstrt][Cmid]==target) {
            return new int[]{Rstrt,Cmid};
         }
        //for second ele in mid column
        if (matrix[Rstrt+1][Cmid]==target) {
            return new int[]{Rstrt+1,Cmid};
        }      

        // now check 4 parts of 2 rows
        if (matrix[Rstrt][Cmid-1]>=target) {
            return new int[]{Rstrt,Cmid-1};
        }else if (matrix[Rstrt][Cmid+1]<=target && target<=matrix[Rstrt][cols-1]) {
            BS(matrix, target, Rstrt, Cmid+1, cols-1);
        }else if (matrix[Rstrt+1][Cmid-1]>=target) {
             return new int[]{Rstrt+1,Cmid-1};
        }else{
            BS(matrix, target, Rstrt+1, Cmid+1, cols-1);
        }

        return new int[]{-1,-1};
     }
}
