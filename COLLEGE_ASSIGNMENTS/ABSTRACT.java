package COLLEGE_ASSIGNMENTS;


abstract class University{
   long StudentId;
   String name;
   University(long StudentId ,String name){
    this.StudentId=StudentId;
    this.name=name;
   }
   abstract void display(); 
}
class Student extends University{
    Student(long StudentId , String name){
        super(StudentId, name);
    }
    void display(){
        System.out.println("Name is " + this.name);
        System.out.println("StudentId of " + this.name +" is "+this.StudentId );
    }
}
public class ABSTRACT {
    public static void main(String[] args) {
        Student obj1 =new Student(2345167, "Rishita Aswal");
        obj1.display();
        Student obj2 =new Student(2178902, "Aabha");
        obj2.display(); 
     }
}
