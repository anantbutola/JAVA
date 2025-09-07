package COLLEGE_ASSIGNMENTS;

import java.util.Arrays;
import java.util.Scanner;

public class LsBs {
    static int LinearSearching(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int BinarySearching(int[] arr, int target) {
        int str = 0;
        int end = arr.length - 1;
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements in array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target Element : ");
        int target = sc.nextInt();
        System.out.println("Option-1 : Linear Search");
        System.out.println("Option-2 : Binary Search");
        System.out.print("Choose : ");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Array :" + Arrays.toString(arr));
                System.out
                        .println("Target Element : " + target + " present in index : " + LinearSearching(arr, target));
                break;
            case 2:
                System.out.println("Array :" + Arrays.toString(arr));
                System.out.println("Array must be sorted");
                Arrays.sort(arr);
                System.out.println("Sorted Array : " + Arrays.toString(arr));
                System.out
                        .println("Target Element : " + target + " present in index : " + BinarySearching(arr, target));
                break;
            default:
                break;
        }
    }
}
