import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while(num1 >= 10){
            int sum = 0;
            while(num1 > 0){
                int temp =num1 % 10;
                sum += temp;
                num1 = num1/10;
            }
            num1 = sum;
        }
        System.out.println(num1);
    }
}