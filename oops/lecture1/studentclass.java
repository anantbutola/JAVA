package oops.lecture1;

public class studentclass {
    public static void main(String[] args) {
        Student anant=new Student();
        System.out.println(anant.rollno);
        System.out.println(anant.name);
        System.out.println(anant.marks);
        anant.greet();
    }
}
class Student{
    int rollno;
    float marks;
    String name;
    void greet(){
        System.out.println("hi my name is"+name);
    }
    Student(){
        this(10, 99.9f, "default");
    }
    Student(int rollno,float no,String naam){
        this.rollno=rollno;
        marks=no;
        name=naam;
    }
}