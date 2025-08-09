package Arrays.assignments;

import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();
        int[] arr=new int[5];
        int j=0;
        while (num>0) {
            int n=num%10;
             
             arr[j]=n;
             j++;
             num=num/10;
        }
        int largest=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i]>largest) {
                largest=arr[i];
            }
        }
        System.out.println("largest no. is:"+largest);
        sc.close();
    }
}
