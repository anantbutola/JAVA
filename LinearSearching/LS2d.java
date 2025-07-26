import java.util.*;

public class LS2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 45, 78, 1 },
                { 11, 666, 33, 97 },
                { 20, 10, 92, 99 }
        };
        System.out.println(Arrays.toString(LS(arr,99)));
    }

    public static int[] LS(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}