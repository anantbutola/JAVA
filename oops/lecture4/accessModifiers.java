package oops.lecture4;
class School{
 private int roll;
  School(int roll){
    this.roll=roll;
  }
  public int getter(){
    return  roll;
  }
  public void setter(int roll){
    this.roll=roll;
  }
}

public class accessModifiers extends School{
    accessModifiers(int roll) {
        super(roll);
        
    }
    public static void main(String[] args) {
        School s1 =new School(10);
        System.out.println(s1.getter());
        s1.setter(21);
        System.out.println(s1.getter());

    }
}


/*
 
     MODIFIERS  |  Class |   Package |   Subclass     |      Subclass     |            World                      |
                |        |           | (Same Package) |    (Diff Package) |  (Differnt Package and Not subclass)  |
    ------------|--------|-----------|----------------|-------------------|---------------------------------------|
      PUBLIC    |   +    |    +      |       +        |        +          |              +                        |
    ------------|--------|-----------|----------------|-------------------|---------------------------------------|
     PROTECTED  |   +    |    +      |       +        |        +          |                                       |
    ------------|--------|-----------|----------------|-------------------|---------------------------------------|
      DEFAULT   |   +    |    +      |       +        |                   |                                       |  
    ------------|--------|-----------|----------------|-------------------|---------------------------------------|
      PRIVATE   |   +    |           |                |                   |                                       |
    ------------|--------|-----------|----------------|-------------------|---------------------------------------|  

    

 * Access Modifiers:Access modifiers in Java are keywords that set the accessibility 
 *                     of classes, fields, methods, and constructors.
 * There are four access modifiers: public, private, protected, and default (no keyword).
 * (1).PUBLIC: The public modifier grants the broadest access. A class, method, or field 
 *            declared as public is accessible from any other class, anywhere in the program.
 

 * (2).PRIVATE: The private modifier provides the most restrictive access. 
 *      Members declared as private are only accessible within the same class. 
 *    This is fundamental to encapsulation and is often used to hide the internal implementation 
 *          details of a class.  
 * Private members can  be accessed via public methods like getters and setters.This indirectly access 
 * private members.
                Eg:     class School{
                        private int roll;
                        School(int roll){
                            this.roll=roll;
                        }
                        public int getter(){
                            return  roll;
                        }
                        public void setter(int roll){
                            this.roll=roll;
                        }
                        }
 

 * (3).DEFAULT:The default access modifier is applied when "no keyword" is specified.
 *  It allows access only within the same package. This is also known as package-private access. 
    
    
 * (4). PROTECTED:The protected modifier allows access within the same package and by subclasses, 
 * even if the subclasses are in a different package. 
 * This is particularly useful for inheritance, as it allows child classes to access 
 * and modify the parent's members without making them publicly available to the entire program.
      Eg:   
    */