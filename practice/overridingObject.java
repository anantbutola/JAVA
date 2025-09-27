package practice;
class Student{
    @Override
    public String  toString(){
        
        return "we are in to string method of object class and we are going to override it";
    }
}
public class overridingObject {
    public static void main(String[] args) {
        Student stud1 = new Student();
        System.out.println(stud1.toString());
    }
}
