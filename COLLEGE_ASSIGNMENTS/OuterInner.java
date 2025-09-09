package COLLEGE_ASSIGNMENTS;


class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    class Result{
        float Maths,Physics,Chemistry;
        Result(float Maths,float Physics,float Chemistry){
            this.Maths=Maths;
            this.Physics=Physics;
            this.Chemistry=Chemistry;
        }
        public void displayResult(){
            float total = this.Maths+this.Physics+this.Chemistry;
            float percentage = total/3;
            System.out.println("Student Name : "+ Student.this.name +"(Roll No.: "+Student.this.rollno +(")"));
            System.out.println("Total Marks : "+total);
            System.out.println("Percentage is : " + percentage);
        }
    }
}
public class OuterInner {
    public static void main(String[] args) {
        Student stud1 = new Student("Anant Butola", 10);
        Student.Result res1 = stud1.new Result(99, 99.9f, 99);
        res1.displayResult();
        System.out.println("-----------------------------------------------");
        Student stud2 = new Student("Maaya",27);
        Student.Result res2 = stud2.new Result(95, 92f, 91);
        res2.displayResult();

    }
}