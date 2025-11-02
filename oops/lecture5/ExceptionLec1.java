package oops.lecture5;

class myException extends Exception{
    myException(String message){
        super(message);
    }
}
class secondException extends RuntimeException{
    secondException(String message){
        super(message);
    }
}
public class ExceptionLec1 {
    public static void main(String[] args) {
        int a =10;
        int b=0;
//        int age=10;
//        age(age);
        try {
            System.out.println(division(a,b));
//            if (true){
//                throw new myException("this exception name is anant");
//            }
//        age(age);
        }catch (myException e){
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("Always executed");
        }


    }
    static int division(int a,int b) throws  myException {
        if(b==0){
            throw new myException("denominator is zero");
        }
        return a/b;
    }
//    static void age(int age){
//        if(age<18){
//            throw  new secondException("Age must be greater than 18");
//        }
//        System.out.println("Valid age");
//    }
}


/*
Exception:Unwanted/Unexpected events that occur during execution of program.
Eg: (a/0)-> arithmetic exception
    (a[5]->but array can access till index 4):array out of bound exception.

Exception Handling:Exception handling is a mechanism in Java to handle runtime errors
(like divide by zero, invalid array access, file not found, etc.)
in a structured way, so that the program does not crash abruptly and can
 continue running or exit gracefully.
 -> with help of java constructs(try,catch,throw,throws,finally etc.)

 try block: in this block,program is executed and if exception came it throw that exception in appropriate
            catch block.
            Eg: try{
                 int c=a/b;
            }

 catch block:this block handles exception thrown by try block.we have multiple catch block acceptable.
            Eg: try{
                 int c=a/b;
            }catch(ArithmeticException e){
                sout(e.getMessage());
            }
            -ArithmeticException is one type of exception in Exception class
              and e is object of ArithmeticException class.
            -Simply,Exception is parent class and ArithmeticException is derived class.

finally block: this block always execute whether exception  occurs or not.
              only "one" in try-catch block.

throw : explicitly throw  error inside method or block.
        make an object of exception and use throw.
        Eg: if(age<18){
        throw new IllegalArgumentException("age must be greater than 18");
        }

throws: Declares exception in method that might be shown by method.
        This tells when we call that method it might throw an exception so handle it.
        Eg:
           static int divide(int a, int b) throws ArithmeticException {
                return a / b;
                }
        ->This divide method might throw arithmetic exception so we handle it.

Types of Exception:
(1). Checked Exception-In these exception, compiler tells you to handle that exception forcefully.
                       They are checked at compile-time.
                       Usually related to external resources(files,databases,networks etc).
     Eg: try {
            FileReader file = new FileReader("abc.txt"); // File may not exist
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

(2). Unchecked Exception: In these exception,compiler not tells you to handle that exception forcefully.
                          These occur during runtime.
                          Usually caused by logic errors.
      Eg: int c = a/0;
      Examples of Unchecked Exception:
      -ArithmeticException &rarr; divide by zero
      -NullPointerException &rarr; calling method on null object
      -ArrayIndexOutOfBoundsException &rarr; accessing invalid array index
      -NumberFormatException &rarr; invalid string to number conversion

EXCEPTIONS V/S  ERRORS
| Feature               | **Exception**                                                                           | **Error**                                                                                             |
| --------------------- | --------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| **Definition**        | Problems that occur during program execution, which can be **handled** using try-catch. | Serious problems that occur mostly due to **JVM/system failure** and are **not meant to be handled**. |
| **Package**           | Belong to `java.lang.Exception` class.                                                  | Belong to `java.lang.Error` class.                                                                    |
| **Recoverable?**      | Usually **recoverable** &rarr; programmer can write code to handle them.                     | Usually **not recoverable** &rarr; programmer cannot do much.                                              |
| **Checked/Unchecked** | Can be **checked (compile-time)** or **unchecked (runtime)**.                           | Always **unchecked**.                                                                                 |
| **Examples**          | `IOException`, `SQLException`, `ArithmeticException`, `NullPointerException`            | `OutOfMemoryError`, `StackOverflowError`, `VirtualMachineError`                                       |
| **Use case**          | Application-level issues (invalid input, file not found, divide by zero).               | System-level issues (JVM crash, memory exhaustion).                                                   |
| **Handling**          | Handled with `try-catch-finally`, `throw`, `throws`.                                    | Not recommended to handle (though technically catchable).                                             |
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-> Custom Exceptions: Means exceptions made by user/programmer.
(1).For Checked Exceptions: Checked exceptions must be declared or handled using throws or try-catch.
Eg:  class myException extends Exception{
    myException(String message){
        super(message);
        }
      }
     static int division(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("denominator is zero");
        }
        return a/b;
    }
    try {
            division(a,b);
    }catch(ArithmeticExcepttion e){
         sout(e);
        }
---> try,catch,throws be there for handling.


(2).For Unchecked Exception:Unchecked exceptions do not need to be declared or handled explicitly.
                            Handling is optional here.
       Eg:
             class secondException extends RuntimeException{
    secondException(String message){
        super(message);
                   }
               }
               static void age(int age){
        if(age<18){
            throw  new secondException("Age must be greater than 18");
        }
        System.out.println("Valid age");
    }
    PSVM(){
       age(17);   // throws exception without try-catch
    }

 */
