

public class countSetBits {
    static int countBits(int n){
        int count =0;
        while(n != 0){
            if(n % 2 == 1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBits(13));
    }
}
