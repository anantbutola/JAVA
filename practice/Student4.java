package practice;
class University{
    String Name;
    long studentID;
    University(String name,long studentID){
        this.Name=name;
        this.studentID=studentID;
    }
    void display(){
        System.out.println("NAme : "+this.Name+" StudentID : "+this.studentID);
    }
}
public class Student4 {
public static void main(String[] args) {
    University[] stud=new University[3];
    stud[0] = new University("ANANT", 10);
    stud[1]=new University("BUTOLA", 12);
    stud[2]=new University("MAAYA",27);

    for (int i = 0; i < stud.length; i++) {
        stud[i].display();
    }
}
}
