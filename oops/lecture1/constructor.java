package oops.lecture1;

public class constructor {
    public static void main(String[] args) {
        // Student anant=new Student(10, "Anant Butola", 99.9f);
        // System.out.println(anant.rollno);
        // System.out.println(anant.marks);
    // System.out.println(anant.name);
    Numbers set1=new Numbers(10, 20, 30);
    //set1.greatest(0, 0, 0);
       set1.output();

}
}
class Numbers{
    int i,j,k;
    Numbers(int i,int j,int k){
        this.i=i;
        this.j=j;
        this.k=k;
    }
    int greatest(int i,int j,int k){
        if (i>k&&i>j) {
            return i;
        }else if (j>k&&j>i) {
            return j;
        }else{
            return k;
        }
    }
    void output(){
        System.out.println(greatest(i, j, k));
    }
}

//  class Student {
//     int rollno;
//     String name;
//     float marks;

//     Student(int rollno, String name, float marks) {
//         this.rollno = rollno;
//         this.name = name;
//         this.marks=marks;
//     }
// }