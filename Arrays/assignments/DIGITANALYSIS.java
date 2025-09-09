package Arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DIGITANALYSIS{

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5-digit No. :");
        num = sc.nextInt();
        int countdigits= 0;
        int digits = num;
        while (digits > 0) {
            countdigits++;
            digits = digits / 10;
        }
        int[] array = new int[countdigits];
        int i = 0;

        while (num > 0) {

            int n = num % 10;

           
            array[i++] = n;

            num = num / 10;
        }
        Arrays.sort(array);
       



 if (array.length == 5) {
            System.out.println("largest no. is:" + array[array.length - 1]);
            System.out.println("smallest no. is:" + array[0]);
            System.out.println("secondLargest no. is:" + array[array.length - 2]);
            System.out.println("secondsmallest no. is:" + array[1]);
        } else {
            System.out.println("Only Enter 5-Digit No.!");
        }

        sc.close();
    }
}


