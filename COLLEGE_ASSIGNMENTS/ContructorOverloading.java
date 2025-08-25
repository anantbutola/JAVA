package COLLEGE_ASSIGNMENTS;

//package oops.assignments;
class Area{
    double length , breadth ,radius; 
    Area(double length , double breadth){
      System.out.println("Area of Rectangle : " + (length * breadth) );
    }
    Area(double radius){
        System.out.println("Area of Circle : " + (3.14 * radius* radius) );
    }
}
public class ContructorOverloading {
    public static void main(String[] args) {
        Area Rectangle = new Area(10.5 , 12);
        Area Circle = new Area(5);
    }
}
