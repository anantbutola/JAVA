package practice;
abstract class student{

   abstract void print();
}
class anant extends student{
    void print(){
        System.out.println("Anant");
    }
}
public class abstarction {
    public static void main(String[] args) {
anant obj = new anant();
    }
}
