package Arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class findingDIGIT {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number tht contains five digits :");
        num = sc.nextInt();
        int count = 0;
        int digits = num;
        while (digits > 0) {
            count++;
            digits = digits / 10;
        }
        int[] arr = new int[count];
        int index = 0;

        while (num > 0) {

            int n = num % 10;

            arr[index++] = n;

            num = num / 10;
        }
        Arrays.sort(arr);
        if (count == 5) {
            System.out.println("Largest no. :" + arr[arr.length - 1]);
            System.out.println("Smallest no. :" + arr[0]);
            System.out.println("SecondLargest no. :" + arr[arr.length - 2]);
            System.out.println("secondsmallest no. :" + arr[1]);
        } else {
            System.out.println("ENTER FIVE DIGIT NUMBER ONLY......");
        }

        sc.close();
    }
}
