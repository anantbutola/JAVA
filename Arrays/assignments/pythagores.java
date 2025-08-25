public class pythagores {
    static int[] triplet(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    int a =arr[i] * arr[i];
                    int b =arr[j] * arr[j];
                    int c =arr[j2] * arr[j2];
                    if ((a == b + c) || (b == a+c) || (c == a+b)) {
                        
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
