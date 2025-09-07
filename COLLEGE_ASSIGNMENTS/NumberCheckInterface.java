package COLLEGE_ASSIGNMENTS;

import java.util.Scanner;

interface PrimeNoChecking {
    boolean prime(int num);
}

interface ArmstrongNoChecking {
    boolean armstrong(int num);
}

class NumberChecking implements PrimeNoChecking, ArmstrongNoChecking {
    public boolean prime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean armstrong(int num) {
        int count = 0;
        int digits = num;
        int temp2=num;
        while (digits > 0) {
            count++;
            digits = digits / 10;
        }
        int sum = 0;
        int temp;
        while (num > 0) {
            temp = num % 10;
            sum = sum + (int) Math.pow(temp, count);
            num = num / 10;
        }
        return sum == temp2;

    }
}

public class NumberCheckInterface {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        NumberChecking num1 = new NumberChecking();
        System.out.println("Armstrong Check: "+num1.armstrong(num));
        System.out.println("Prime Check: "+num1.prime(num));
    }
}
