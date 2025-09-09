package Arrays.assignments;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=Math.pow(x, i);
        }
        System.out.println("Sum of series : "+sum );
        sc.close();
    }
}
