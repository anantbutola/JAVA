package Arrays.assignments;

public class armstrong {
    static int arms(int  num){
        int digits =num;
        int count =0;
        while (digits>0) {
            count ++;
            
            digits=digits/10;
        }
        int sum=0;
        while (num>0) {
            double temp=num%10;
            sum= sum + (int)Math.pow(temp, count);
            num =num /10;
        }
        return sum;
    } 
    public static void main(String[] args) {
        int num=9474;
        int armstrong = arms(num);
        if (num==armstrong) {
            System.out.println("good jii");
        }else{
            System.out.println("bad jii");
        }
    }
}
