package COLLEGE_ASSIGNMENTS;
import COLLEGE_ASSIGNMENTS.P.Demo;
import COLLEGE_ASSIGNMENTS.P.P1.B;
import COLLEGE_ASSIGNMENTS.P.P1.P2.A;
class B2 extends B{
    void Show(){
        show();
    }
}
public class PackageSubpackage {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.display();
        B2 obj2 = new B2();
        obj2.Show();
        A obj = new A();
        obj.print();
    }
}
