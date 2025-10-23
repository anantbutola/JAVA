package Threads.Synchronization;
/*
-Synchronization in Java is a mechanism to control access to shared resources by multiple threads.
-If multiple threads try to access the same resource (like a variable, method, or file) at the same time,
it can cause inconsistency or data corruption — known as a race condition.

 Synchronization ensures only one thread executes a block of code at a time.
 */
public class SCKeyword {
    public static void main(String[] args) {

        counter ab1 = new counter();

Thread t1 = new Thread(  ()->{
        for (int i = 0; i < 100; i++) {
        ab1.count();
    }
}
);
Thread t2 = new Thread(  ()->{
    for (int i = 0; i < 100; i++) {
        ab1.count();
    }
}
);
        t1.start();
        t2.start();
try {

    t1.join();
    t2.join();

} catch (InterruptedException e) {
    throw new RuntimeException(e);
}
        System.out.println("Count: " + ab1.c);
    }
}
class counter{
    int c=0;
    synchronized void count(){
        c++;
    }
}
/*
Why It Works:
-- When a method is marked as synchronized,
Java locks the object before entering that method —
so only one thread can access it at a time.
-- When one thread finishes, the lock is released,
and another thread can enter.

Important Notes
-Synchronization reduces performance (slower execution) because threads wait for locks.
-Overuse of synchronization can cause deadlocks (threads waiting forever).
-Prefer using synchronization only when threads share mutable data.
 */