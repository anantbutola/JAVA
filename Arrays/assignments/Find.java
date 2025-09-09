package Arrays.assignments;

import java.util.Scanner;

public class Find{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 5 digit number");
      int number = sc.nextInt(); 
      if(number<10000||number>99999){
      System.out.println("This input is invalid to use");
      return;
        }      
       int largest = -1, secondLargest = -1;
        int smallest = 10, secondSmallest = 10;

        while (number > 0) {
            int digit = number % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }

            number /= 10;
        }

        System.out.println("Greatest: " + largest);
        System.out.println("Second Greatest: " + secondLargest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}
