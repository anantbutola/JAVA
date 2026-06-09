public class Togglebit {
    static int toggling(int n, int pos){
        n = (n ^ (1<<pos));
        return n;
    }
    public static void main(String[] args) {
        System.out.println(toggling(13,2));
    }
}
