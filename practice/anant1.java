package practice;
interface school1{
    int  a =10;
}
interface school2{
    int a = 12;
}
class university implements school2 , school1 {
    void print(){
        System.out.println(school1.a);
        System.out.println(school2.a);
    }
}
public class anant1 {
    public static void main(String[] args) {
        university obj = new university();
        obj.print();
    }
}
