package Threads.Interrupts;
/*
When you start any Java program (run main()),
the Java Virtual Machine (JVM) automatically creates one thread —
that’s called the main thread.
In every code , java make one default thread main(that's our main methods).
 */
public class IntteruptSleepThread {
    public static void main(String[] args) {
        // This code runs in the MAIN THREAD
        Thread t1 = new Thread( ()->{       //Creating new thread using lambda.
           try{                              // This code runs in the CHILD THREAD (t1)
               for (int i = 0; i < 50; i++) {
                   System.out.println("Number "+i);
                   Thread.sleep(2000);    //Sleep for 2 seconds
               }
           }catch (InterruptedException e){      //Sleep method throw InterruptedException.
               System.out.println("Thread interrupted");
           }
            System.out.println("Exiting");
    });
        t1.start();         // main thread tells t1 to start working
        try{
            Thread.sleep(3000);          // main thread sleeps for 3 seconds(waits)
        }catch (InterruptedException e){
           System.out.println(e.getMessage());
        }

        System.out.println("main thread interrupting t1");
        t1.interrupt();        // main thread interrupts t1
    }
}
/*
STEPS:
  1. Thread Creation
-You create a new thread t1 using a lambda (() -> { ... }).
-Inside the thread’s run() method, it prints numbers from 0 to 49.
-After printing each number, it sleeps for 2 seconds (Thread.sleep(2000)).

  2. Main Thread
-The main thread starts t1 → t1.start()
-Then the main thread itself sleeps for 3 seconds:
        Thread.sleep(3000);

          | Time | Action                                          |
          | ---- | ----------------------------------------------- |
          | 0s   | `t1` starts → prints "Number 0", then sleeps 2s |
          | 2s   | `t1` wakes → prints "Number 1", then sleeps 2s  |
          | 3s   | Main thread wakes up and calls `t1.interrupt()` |

 3. Interrupt Happens
-When the main thread executes:
         t1.interrupt();
-It sends an interrupt signal to thread t1.
-At this moment, t1 is sleeping inside Thread.sleep(2000).
-When a thread is sleeping and receives an interrupt signal:
     -->It immediately wakes up.
     -->It throws an InterruptedException.

Why Does This Happen?
-When a thread is in a sleep/wait/join state and gets interrupted →
it doesn’t continue sleeping; instead, it throws an InterruptedException.
-The thread must handle that exception (like your code does).
-After catching it, we can either:
      -->Exit gracefully (as in your code), or
      -->Continue working (if we want to ignore the interrupt).

** Key Points to Remember
-interrupt() → just sends a signal, it doesn’t force-stop the thread.
-The target thread must cooperate by checking or catching interruption.
-Methods like sleep(), wait(), and join() throw InterruptedException when interrupted.
-Always handle interruption properly to avoid leaving resources (files, sockets) open.
 */
