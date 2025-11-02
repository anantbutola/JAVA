package oops.lecture3;
 class student{
    int rollno;
    String name="anant";
    int age;
    //private long PhnoNo;
    student(int rollno,String name,int age){
        super();
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        //this.PhnoNo=256671257;
    }
    void greet(){
        System.out.println("Hi"+name +", Welcome in programming");
    }
}
 class studentID extends student{
  int id;
  String name;
  
  studentID(int rollno,String name,int age,int id){
    super(rollno, name, age);     //Simply, calls the constructor of parent class
         this.id=id;
       System.out.println(this.name);
         
  }
  void greet(){
        System.out.println("Hi ,Welcome back");
    }

}
public class inhertance {
    public static void main(String[] args) {
    //     studentID student1=new studentID(10, "Anant butola",21 , 2103363);
       // student1.PhnoNo;

    //     System.out.println(student1.name+"-->"+student1.age+"-->"+student1.rollno+"-->"+student1.id);
   studentID student1=new studentID(0, null, 0,0);
   student1.greet();
   System.out.println(student1.age);
}
}



/*
 * Inheritance is a process in which (derived or child or subclass) inherits or access the properties and methods
 * of (base or parent or superclass).
 * With the help of (extends)keyword we help derived class to access members(not private) of base class.
 For eg:
                class student{        // Parent class(student)
                    int rollno;
                    String name;
                    int age;
                    student(int rollno,String name,int age){
                        this.rollno=rollno;
                        this.name=name;
                        this.age=age;
                    }
                }
                class studentID extends student{      //Child class(studentID)
                int id;
                studentID(int rollno,String name,int age,int id){
                    super(rollno, name, age);     //Simply, calls the constructor of parent class
                        this.id=id;
                }
                    }
*In the example,we make a parent class (student) which assign some values like name,age,rollno.
*It has its child class(studentID) which assign (id) for its parent class.
*Child class(studentID) access instance variables of its parent class.
*(super) keyword: It is used to intialize values.It simply calls the constructor of parent class for intializing values.
   eg:   super(rollno, name, age);   It calls the constructor and assign rollno,age and name of student.
         * Here,Super Keyword  use inside the constructor...  
*How Derived class access Base class members?
 eg:
        studentID student1=new studentID(10, "Anant butola",21 , 2103363);
        System.out.println(student1.name+"-->"+student1.age+"-->"+student1.rollno+"-->"+student1.id);
*(Private) variables are only available in respective class only.
*We can't access private members in derived class or anywhere else.
eg: private long PhnoNo;

*Superclass Variable can reference Subclass object
 Means when we create reference variable of type(superclass or parent class) and  it points towards the 
 subclass object .
 eg:   student student1=new studentID(0,null,0,0);
 Here, student is base class and studentID is subclass.
 *In which,reference type(student) determines which members it can access.
 *means it can access only base class members
 *But if there is overridden functions like above greet() function,Only that function will be called
 *that are of object type.
 eg: There is greet() function in base and derived class.When we create a reference variable of type student but
      having objects of type studentID .greet() function of class studentID is called.
      B/c in Compile time,java only looks at type of variable but when calling overridden function 
      it only looks at object type.
*Here superclass reference can point towards subclass object
*but subclass reference cannot point towards superclass object


More About (super)keyword:
*Super keyword calls the constructor of base class to derived class.
*If derived class inherits members from base class.It must call base class constructor in
* The derived class constructor using (super)keyword.
*Parent class has Object class above it.Therefore, when we make parent_class constructor it automatically
*calls the constructor of Object class.
If there is two classes student and studentid,and having common instance variable (name) and we want to print name
in derived class constructor.If we want to print derived class (name)instance use(this.name) and if we want to print parent class
(name)instance use (super.name).
 */