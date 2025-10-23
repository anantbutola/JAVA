package Threads;
/*
This program shows the two main ways to create threads in Java:
-Extending the Thread class
-Implementing the Runnable interface
Both are used to run code concurrently (at the same time) — allowing multitasking.
 */
/*`
When you call start() on an object of A1:
-Java creates a new thread in memory.
-That thread automatically calls the run() method.
-The code inside run() executes in parallel to the main program.
 */
class A1 extends Thread{  // A1 inherits properties and method from Thread class.
    int a =10;
    public void run(){    //Thread already has run method so here we override it.
        System.out.println("We are in class A1 and value of a is "+ a);
    }
}

class A2 implements Runnable{  //Runnable is functional interface having only one method run() in it.
    int a =12;
    public void run(){  //Override run method with our task
        System.out.println("We are in class A2 and value of a is "+ a);
    }
}

public class StartingAThread {
    public static void main(String[] args) {
        A1 hi = new A1();     // create object of A1 means creating first thread(hi).
        hi.start();           // call run method  with help of A1 object.

        A2 hi2 = new A2();             //Create runnable object
        Thread t1 = new Thread(hi2);   //we pass it to thread constructor
        t1.start();                    //Then we call run method b/c runnable doesn't have start() method.
    }
}

/*
| Step | Thread Name | Action                                                | What Happens                                        |
| ---- | ----------- | ----------------------------------------------------- | --------------------------------------------------- |
| 1    | `main`      | Creates object `hi` (A1)                              | Not yet running thread                              |
| 2    | `main`      | Calls `hi.start()`                                    | JVM creates a **new thread** → runs A1’s `run()`    |
| 3    | `main`      | Creates object `hi2` (A2)                             | Runnable task created                               |
| 4    | `main`      | Creates `Thread t1 = new Thread(hi2)`                 | Prepares a new thread with A2’s task                |
| 5    | `main`      | Calls `t1.start()`                                    | Starts a **second thread**, which runs A2’s `run()` |
| 6    | —           | Now both threads (`A1` and `A2`) run **concurrently** |                                                     |
 */

