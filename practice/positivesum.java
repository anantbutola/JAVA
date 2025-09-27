package practice;

public class positivesum {
    public static void main(String[] args) {
        int[][] arr ={
         {-1,2,8},
         {2,-8,-4},
         {6,3,-1}
        };
        int sum=0;
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[index].length; i++) {
                if (arr[index][i]>0) {
                    sum += arr[index][i];
                }
            }
        }
        System.out.println("SUM IS : "+sum);
    }
}
