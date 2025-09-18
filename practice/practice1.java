package practice;
class school{
float fees;
school(float fees){
    this.fees=fees;
}
class student{
    int rollno;
    String name;
    student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    void print(){
        System.out.println("Name of Student is "+ this.name);
        System.out.println("Roll no is "+this.rollno);
        System.out.println("Fees is "+ school.this.fees);
    }
}

}
public class practice1 {
    public static void main(String[] args) {
     school student1 = new  school(123);
     school.student obj1 = student1.new student(10,"Anant");
     obj1.print();

    }
}


//    static  int a=101;
//    int b = 20;
//   static int c;
//    static{
//        c= a *10;
//    }
//    static void print(){
//        test obj = new test();
//        System.out.println(a);
//        System.out.println(obj.b);
//    }


 //System.out.println(test.a);
//        test obj1=new test();
//        System.out.println(obj1.a);
//        System.out.println(test.c);
//
//        test.print();

//    private int a =10;
//   protected int b=5;
//    public int c=9;
//   int d =10;
//   void getter(){
//       System.out.println(a);
//   }
//   void setter(int a){
//       this.a =a ;
//   }