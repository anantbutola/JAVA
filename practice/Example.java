package practice;
import practice.PKG.PKG1.A;
import practice.PKG.PKG2.B;
class subclass extends A{
    void getter(){
        System.out.println("Value of a is "+ a);
    }
}
public class Example {
    public static void main(String[] args) {
//        subclass obj1 = new subclass();
//        obj1.getter();

        B obj2 = new B();
        System.out.println(obj2.d);
         obj2.getter();

    }
}
