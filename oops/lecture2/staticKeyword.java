package oops.lecture2;

public class staticKeyword {
    public static void main(String[] args) {
    //  Human anant=new Human(21, "anant butola", false);
    //  Human rahul=new Human(24, "rahul kumar", true);
    // System.out.println(Human.population);
    
     
    //  System.out.println(Human.population);

    static_Initialization obj=new static_Initialization();
    System.out.println(static_Initialization.a+"  "+static_Initialization.b);
    static_Initialization obj2=new static_Initialization();
    static_Initialization.b=static_Initialization.b+10;
    System.out.println(static_Initialization.a+"  "+static_Initialization.b);
    }
}
class static_Initialization{
    static int a=5;
    static int b;
    static{
        System.out.println("We are in static block");
        b=4*a;
    }
}
// class Human {
//     int age;
//     String name;
//     boolean married;
//     static int population;  // declaration of  static member(also known as class variable)

// Human(int age,String name,boolean married){
//     this.age=age;
//     this.name=name;
//     this.married=married;
//     Human.population += 1;   //  accessed via class_name(Human)
// }
// }
/*
 * Static variables:  If we make any member as static , it should be accessed before any objects of its class are created.
 *  We make variables as well as methods static.
 * most common eg is main() function
 *
 * main() function should be accessed before creating object of that class.
 * static member create single copy of its own and shared among all instances of class.
 * static member should be accessed via class or objects but (Best convention is to use with classname).
 * static member only depends on class not on objects.
  syntax:    class_name.instance_variable;
 */

 /*
 WHY NON-STATIC METHODS AND VARIABLES NOT BE USED INSIDE STATIC VARIABLES AND METHODS?
  * static members only access static data.(depends on class only)
  * non-static members only depends on objects.
  *  ->when static member is called ,maybe there is no instance(object) of that class present.
  *  ->static method doesn't know which object variable or method you mean to use.
  eg: class MyClass {
    static int staticVar = 10;
    int instanceVar = 20;

    static void staticMethod() {
        System.out.println(staticVar);    // OK - static to static
        System.out.println(instanceVar); // ERROR - Cannot access non-static data from static context
    }
}

  *We can access it by providing reference to an object.

  eg: class MyClass {
    static int staticVar = 10;
    int instanceVar = 20;

    static void staticMethod() {
    MyClass obj=new MyClass();
        System.out.println(staticVar);    // OK - static to static
        System.out.println(obj.instanceVar); // now it is correct we provide reference to an object(instance)
    }
}
  */
     
  /*
    STATIC MEMBERS USED INSIDE NON-STATIC MEMBERS
   * B/c static members are belongs to class itself and always available inside it.It doesn't depend on instances.
   * (this) keyword is non-static b/c this represents object itself.Therefore  ,we can't use (this) inside static members
   */

   /*
    INITIALIZATION OF STATIC VARIABLES
    *With the help of static block
    *If we create multiple objects of respective class, static block run only once when the first object of class is created.
     eg:
     class static_Initialization{
    static int a=5;
    static int b;
    static{                       // it runs only once when first object of class is created only....
        System.out.println("We are in static block");
        b=4*a;
    }
}
    */