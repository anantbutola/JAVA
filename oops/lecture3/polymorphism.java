package oops.lecture3;

// class Area {
//     Area() {
//         System.out.println("Area is 0");
//     }

//     Area(int length, int breadth) {
//         System.out.println("Area is : " + (length * breadth));
//     }

//     Area(float radius) {
//         System.out.println("Area is " + (3.14 * radius * radius));
//     }
// }
class car{ 
    
  void show(){
    System.out.println("CAR name Ferrari");
}
}
class truck extends car{
    void show(){
    System.out.println("Truck name Ashok ");
}
}
public class polymorphism {
    public static void main(String[] args) {
        // Area a1 = new Area();
        // Area a2 = new Area(10);
        // Area a3 = new Area(10, 20);
      
    car c1 = new car();   // here refrence_type and object type are of base class
    c1.show();             // base class method called
    truck t1=new truck();   // here refrence_type and object type are of child class
    t1.show();              // child class method called
    car c2= new truck();   // here refrence_type is from base_class and object_type is from child_class
    c2.show();           //if methods are overrriden,object_type method is called.
    }
}

/*
 * Polymorphism: Polymorphism in Java is a core concept of object-oriented
 * programming (OOP) that allows objects to take on many forms.
 * 
 * The term "polymorphism" comes from the Greek words "poly" (meaning many) and
 * "morph" (meaning forms). It enables you to write code that's more flexible,
 * reusable, and easier to maintain.
 * 
 * In simple terms, polymorphism means that a single name can have multiple
 * meanings, depending on the context. In Java, this is primarily achieved
 * through method overriding and method overloading.
 * 
 * Types of Polymorphism:
 * (1). Compile-Time/Static Polymorphism(Late-Binding) : Achieved via method overloading.
 * -Method Overloading means having same name but diffrent arguements,return
 * type,ordering etc.
 * Ex: Multiple Constructors
                 class Area {
                 Area(){
                 System.out.println("Area is 0");
                 }
                 Area(int length , int breadth){
                 System.out.println("Area is : "+(length * breadth));
                 }
                 Area(float radius){
                 System.out.println("Area is "+(3.14 *radius*radius));
                 }
                 }
 * 
 * 
 * This is constructor overloading where we have multiple constructors of class
 * Area but different
 * parameters.So acc to parameters we provide that constructor called.
 * 
 * 
 * Why , it is called compile-time polymorphism?
 * Compile-time polymorphism is called "compile-time" because the compiler
 * determines which method to call before the program is executed.
 * 
 * (2).Dynamic or Run-Time Polymorphism(Late Binding) :Achieved via method overriding.
 * Method Overrriding means, in run-time we decide which overriden method should
 * be called.
 * This happens in "inheritance" case.
 * How it works?
 * It relies on the principle that a parent class reference variable can point
 * to a child class object.
 * 
 * When you call a method that's been overridden in the subclass, the Java
 * Virtual Machine (JVM) looks at the actual object type (the subclass) at
 * runtime and executes that specific implementation, rather than the one in the
 * parent class.------------------>>>>>(How overriding works?)
 * 
 *     Eg:                 
                            class car{         //BaseClass
                            void show(){
                                System.out.println("CAR name Ferrari");
                            }
                            }
                            class truck extends car{     //ChildClass
                               @Override 
                                void show(){
                                System.out.println("Truck name Ashok ");
                            }
                            }
           psvm(){
    car c1 = new car();   // here refrence_type and object type are of base class
    c1.show();             // base class method called
    truck t1=new truck();   // here refrence_type and object type are of child class
    t1.show();              // child class method called
    car c2= new truck();   // here refrence_type is from base_class and object_type is from child_class
    c2.show();           //if methods are overrriden,object_type method is called.
                        } 

  *   car c2= new truck() -->Here refrence type is of base_class(car) and object type is of child class(truck).
  *   Left side always determines which class members should we access but in case of overrriden methods
  *   right side means object type determines which method should we access.    
  
  
  *If we make a method to be "final" we can't overrride that method further in child class.
  *WHY?---->When a method is declared as final, it signals to the compiler and other developers 
  *that its implementation is the final version and should not be changed or altered in any subclass.
  
  *If we make class "final" then it can't be further extended or inherited.It implicitlly, makes methods 
  * or instances inside the class "final" also.
  *(final)---> Ensures consistency , immutability and security.


  * If we make static method try to overrride it.It can't be overrride.
  *Simply,Static Methods can't be overrride.
  *Why?---->"Overriding" depends on objects and "static" doesn't depends on objects it depends on class
  * Hence, we cannot override static methods.
      
                   Eg:  
                        class car{ 
                        static void show(){
                            System.out.println("CAR name Ferrari");
                        }
                        }
                        class truck extends car{
                        static void show(){
                            System.out.println("Truck name Ashok ");
                        }
                        }
                        psvm(){
                        car c1 = new car();    //"CAR name Ferrari"
                        c1.show();                
                        truck t1=new truck();    //"Truck name Ashok"
                        t1.show();             
                        car c2= new truck();    //"CAR name Ferrari"
                        c2.show();    //static doesn't depends on objects
                        }
*When a subclass defines a static method with the same name and signature 
*as a static method in its superclass, it's not considered overriding. 
*It's called "method hiding". The subclass's method hides the superclass's method. 
*The key difference is that the method to be executed is decided by the reference type, 
*not the actual object type, which is the cornerstone of polymorphism.
 */