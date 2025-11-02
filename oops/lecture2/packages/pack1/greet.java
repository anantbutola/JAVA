package oops.lecture2.packages.pack1;
import static oops.lecture2.packages.pack2.greet.welcome;
public class greet {
    public static void main(String[] args) {
        System.out.println("Hi my name is anant");
        welcome();
    }
}
/*
 * As we can see that we create a package name folder in oops folder in which we create 2 folders named pack1 and pack2.
 * In both folders there is same class name files there (greet.java).
 * Java not allow to create same name class files in single folder that's why we use concept of packages in there.
 * Packages are simply folders.
 * Packages are containers for classes.They are used to keep the class name space compartmentalized.
 Eg:  package oops.packages.pack1;
 Here package is keyword which define where is our class(simply address of greet class in this example. )
 oops/
 └── packages/
      └── pack1/
           └── greet.java
 */
/*
 * If we want to use methods and properties of another class that is in another package , we use "import" keyword.
 * like in this program we use method welcome() of another package (pack2) in here using import keyword
 * we simply import the method from pack2 to pack1.
 eg:  import static oops.packages.pack2.greet.welcome;
 * Function we called in this program should Be (public) in property. 
 * If we want to call method in the program that is in another file but in same package we simply not use import in that case ,we directly use it.
 
 */
