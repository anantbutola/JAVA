package Arrays.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pythagores {
    static int[][] triplet(int[] arr) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[j2];
                    if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) {
                    result.add(new int[] { a, b, c }) ;
                    }
                }
                
            }
        }
       if (result.isEmpty()) {
        return new int[][]{{-1}};
       }

       return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5,6, 8, 9,10 };
         int[][] num=triplet(arr);
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
    }
}
