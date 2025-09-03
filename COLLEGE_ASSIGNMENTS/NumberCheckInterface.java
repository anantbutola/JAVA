package COLLEGE_ASSIGNMENTS;

interface PrimeNoChecking {
    public boolean prime(int num);
}

interface ArmstrongNoChecking {
    public boolean armstrong(int num);
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
        if (sum == temp2) {
            return true;
        } else {
            return false;
        }

    }
}

public class NumberCheckInterface {
    public static void main(String[] args) {
        NumberChecking num1 = new NumberChecking();
        System.out.println(num1.armstrong(153));
        System.out.println(num1.prime(15));
    }
}
