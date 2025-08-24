
abstract class School{
   int rollno;
   String name;
   School(int rollno ,String name){
    this.rollno=rollno;
    this.name=name;
   }
   abstract void show(); 
}
class Student extends School{
    Student(int rollno , String name){
        super(rollno, name);
    }
    void show(){
        System.out.println("Name : " + this.name);
        System.out.println("RollNo : " + this.rollno );
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Student s1 =new Student(10, "Anant Butola");
        s1.show();
        Student s2 =new Student(27, "Maya");
        s2.show(); 
     }
}
