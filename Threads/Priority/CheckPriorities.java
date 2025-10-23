package Threads.Priority;
/*
What Is Thread Priority?
Each thread in Java has a priority level that helps the thread
scheduler decide the order of execution when multiple threads are competing for CPU time.
-> Priority is an integer value between 1 and 10.
| Constant               | Value | Meaning                   |
| ---------------------- | ----- | ------------------------- |
| `Thread.MIN_PRIORITY`  | 1     | Lowest priority           |
| `Thread.NORM_PRIORITY` | 5     | Normal (default) priority |
| `Thread.MAX_PRIORITY`  | 10    | Highest priority          |

-> Important Point
-Thread priority is only a suggestion to the JVM’s thread scheduler —
    the actual behavior depends on the operating system.
- On Windows, higher priority threads may get more CPU time.
- On Linux/Mac, the OS scheduler often ignores Java thread priority
      — all threads get fair time-sharing.
So, priority ≠ guaranteed order — it’s just a hint.
 */
public class CheckPriorities {
    public static void main(String[] args) {
     Thread t1 = new Thread( ()->{
         for (int i = 0; i < 10; i++) {
             System.out.println("Thread-1 Process: "+i);
         }
     }
     );
        Thread t2 = new Thread( ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread-2 Process: "+i);
            }
        }
        );
     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.MAX_PRIORITY);

     t1.start();
     try {
         Thread.sleep(5);
     } catch (InterruptedException e) {
         System.out.println(e.getMessage());
     }
     t2.start();
    }
}
