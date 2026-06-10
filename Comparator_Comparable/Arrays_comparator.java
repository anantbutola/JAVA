package Comparator_Comparable;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Comparator;

public class Arrays_comparator {
    static void main() {
        Integer[] arr = {7,1,9,3,5,2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr , new rearrange());
        System.out.println(Arrays.toString(arr));
    }
}
class rearrange implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
