package practice;
 class  A{
      void display(){
        System.out.println("Inside display A");
    }
}
final class B extends A{
    void display(){
        System.out.println("Inside display B");
    }
}
public class finaL {
    public static void main(String[] args) {
        B obj = new B();

        obj.display();
    }
}
