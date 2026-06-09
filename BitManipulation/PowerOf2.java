

public class PowerOf2 {
    static boolean powercheck(int n){
        if(n==0){
            return true;
        }
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(powercheck(2));
    }
}