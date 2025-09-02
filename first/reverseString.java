public class reverseString {
    
    public static void main(String[] args) {
        int[] arr ={2,2,2,3,3,4,5,6,7,7,7,8,9};
        int count =0;
        
        for (int i = 0; i < arr.length-1; i++) {
            boolean isDuplicate =false;
            for (int j = 0; j < arr.length; j++) {
                if ( arr[i] == arr[j]) {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }
        System.out.println(count);
    }
}
