package oops.lecture2;

public class finalkeyword {
    public static void main(String[] args) {
        // // final int a=10;
        // // System.out.println(a);
        //   final Student anant=new Student("Anant Butola");
        //  System.out.println(anant.name);
        //   anant.name="ramesh";
        //   System.out.println(anant.name);
        // //  anant=new Student("radha");
        // //  System.out.println(anant.name);
        
       
        for (int i = 0; i < 1000000; i++) {
            Student obj=new Student(null);
        }
    }
}
class Student{
    int rollno;
   String name;
   Student(String name){
      this.name=name;
   }
   @Override
   protected void finalize() throws Throwable {
       System.out.println("Finalize method called");
   }
}

/*
 *In primitive datatype, if we make any variable to final and assign value to it. It can't be reassign later in program.
 * It must be initialized and assign value if we use final keyword.It can't be only assign.
  Eg:    final int a=10;
 */
/*
 *But for non-primitives, we cannot reassignn that "object" but we can change "value of that object".
 Eg:  
    final Student anant=new Student("Anant Butola");  // we create object using final keyword
          anant.name="ramesh";                  // this is correct b/c we only assign value to the object
          System.out.println(anant.name);
         anant=new Student("radha");          // This is wrong ,we cannot reassign the object (anant). 
         System.out.println(anant.name);      // throws compile time error
 */
/*
 * In java , whenever object is created for destroying that object, destructor automatically called.
 * Garbage Collector: If we create variable "a" that assign some value '10' and later we reassign that value to "20" then '30' and so on....
 * Garbage Collector removes that values from heap memory....
 * As we know that java not give permission to manually destroy the objects we created.
 * In c++, destroyer give message when it destroys the object.We can do that with java also using Finalize() method.
 * Garbage Collector calls this method before object is destroyed .
 eg: 
  @Override
   protected void finalize() throws Throwable {
       System.out.println("Finalize method called");
   }
 */