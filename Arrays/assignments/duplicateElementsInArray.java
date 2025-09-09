package Arrays.assignments;

// import java.util.Arrays;

public class duplicateElementsInArray {
    public static int removeDuplicates(int[] nums) {
       if (nums.length==0) {
        return 0;
       }
       int count=1;
       for (int i = 1; i < nums.length; i++) {
        if (nums[i]!=nums[count-1]) {
            nums[count]=nums[i];
            count++;
        }
       }  
       return count;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        System.out.println(removeDuplicates(nums));
    }
}
