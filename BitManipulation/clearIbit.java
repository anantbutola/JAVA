public class clearIbit {
    static int clearBit(int n , int pos){
        n = n & ~(n<<pos);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(clearBit(13, 2));
    }
}

/*
        n=13 ,pos =2 
        1101
        1011
      & -----
        1001. --> 9
*/
