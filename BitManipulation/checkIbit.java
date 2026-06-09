public class checkIbit {
    static boolean bitcheck(int n, int IthBit){
        if((n & (1<<IthBit)) != 0 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(bitcheck(13,2));
    }
}
