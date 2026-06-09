public class setibit {
    static int setBit(int n , int pos){
        n= (n | (1<<pos));
        return n;
    }
    public static void main(String[] args) {
        System.out.println(setBit(9,2));
    }
}
