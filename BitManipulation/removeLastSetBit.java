public class removeLastSetBit {
    static int removeBit(int n){
        n = (n & (n-1));
        return n;
    }
    public static void main(String[] args) {
        System.out.println(removeBit(40));
    }
    
}

/*
  n =8
    1000
    0111
    0000

  n =13
   1101
   1100
   1100

   n=2
   10
   01
   00

*/
