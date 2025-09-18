package practice;
class Person{
    String firstname;
    String lastname;
    Person(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }
    void getFirstName(){
        System.out.println(this.firstname);
    }
    void getLastName(){
        System.out.println(this.lastname);
    }
}
class Employee extends Person{
    int EmployeeId;
    String JobTitle;
    Employee(String firstname , String lastname , int EmployeeId , String JobTitle){
      super(firstname,lastname);
      this.EmployeeId=EmployeeId;
      this.JobTitle=JobTitle;
    }
    void getEmployeeID(){
        System.out.println(this.EmployeeId);
    }
    void getLastName(){
        System.out.println(this.lastname + "    " +  this.JobTitle);
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Employee obj1 = new Employee("anant","butola",23011427,"SDE-3");
        obj1.getEmployeeID();
        obj1.getLastName();
        obj1.getFirstName();

    }

}
