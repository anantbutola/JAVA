package Binarysearching;

public class Q1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 3, 1 };
        int target = 4;
        int ans1 = searchIndexleftHAlf(arr, target);
        int ans2 = searchIndexrightHAlf(arr, target);
        if (ans1 != -1) {
            System.out.println(ans1);
        } else System.out.println(ans2);
    }

    public static int searchIndexleftHAlf(int[] arr, int target) {
        int str = 0;
        int end = peakIndexInMountainArray(arr);
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

    public static int searchIndexrightHAlf(int[] arr, int target) {
        int str = peakIndexInMountainArray(arr) + 1;
        int end = arr.length - 1;
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                str = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int str = 0;
        int end = arr.length - 1;
        while (end > str) {
            int mid = str + (end - str) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                str = mid + 1;
            }
        }
        return end;
    }
}
