package Threads.StopMethod;
/*
STOP Method:
In older versions of Java, the Thread.stop() method was used to immediately
terminate a thread’s execution,no matter where it was or what it was doing.

Why stop() is Deprecated?
-Java officially deprecated Thread.stop() (and related methods like suspend() and resume()) because it is unsafe and unpredictable.
️- Problems with stop()
 -Immediate termination: It kills the thread instantly — without giving it a chance to finish its current work.
 -Inconsistent state: The thread might be in the middle of modifying a shared resource (e.g., writing to a file or updating a variable). Stopping it abruptly can leave the resource in an incomplete or corrupted state.
 -Locks and synchronization issues: If a thread holds a lock on an object and gets stopped, other threads might get stuck waiting forever for that lock.
 -Difficult debugging: It can make your program behave randomly or crash without clear reasons.
 */
public class Stop {
    public static void main(String[] args) {
        Thread t1 = new  Thread( ()->{
            for (int i = 0; i < 15; i++) {
                try{
                    System.out.println("Number: "+i);
                    Thread.sleep(1000);   // 1 sec sleep
            } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                                }
        } }
        );
        t1.start();
        try{
            Thread.sleep(3000);  //3sec sleep
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Thread t1 going to be stopped using stop-method");
           // t1.stop();      //Deprecated method not able to use in newer version of jdk
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
