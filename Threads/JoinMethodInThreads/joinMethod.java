package Threads.JoinMethodInThreads;
/*
->when you call join() on a thread,
the current thread pauses its execution until the target thread has completed.
    Eg: t1.join() -> Main thread stop its own task and tells t1 to complete their task first
                     and then main thread resume their own task.

 */
public class joinMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread( ()-> {
        for(int j=0;j<10;j++){
            try{
                System.out.println("Process: "+ j);
                Thread.sleep(1000);   //Sleep for 1 sec and then resume for each iteration
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }
            System.out.println("Exiting Thread t1");
        }
        );
        t1.start();
        try{
            Thread.sleep(2000);   //Main thread sleep for 2 seconds
            System.out.println("Main thread working");
            t1.join();                 // Main stops and t1 continue its task then main resumes
            System.out.println("Main thread exiting");   // It will print when t1 completes
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
/*

Step 1: Main thread starts the program
-The main() method runs inside the main thread.
-It creates a new thread t1 (Runnable → prints numbers 0 to 9 with 1-second delay each).

Step 2: t1.start() called
-The new thread (t1) starts executing in parallel.
-Now we have two threads:
     > Main Thread
     > t1 Thread

Step 3: Both threads running together
-Immediately after t1.start(), both threads run concurrently.
      t1 prints:
      Process: 0
      Process: 1
      ...
(each with a 1-second delay)
-Meanwhile, the main thread executes:
-Thread.sleep(2000);
So it sleeps for 2 seconds and does nothing during that time.

Step 4: After 2 seconds...
-Main thread wakes up and prints:
-Main thread working
-But t1 is still printing numbers (it hasn’t finished yet).

Step 5: t1.join() called
-When main thread calls t1.join(), it says:
-"I’ll wait here until t1 finishes completely."
-So now the main thread pauses and waits for t1 to finish its loop (printing numbers 0–9).

Step 6: t1 finishes its loop
-t1 prints:
     Process: 9
     Exiting Thread t1
-Once this happens, t1 finishes execution.

Step 7: Main thread resumes
-After t1 exits, the main thread resumes (after the join() line).
    Main thread exiting  (This executes)
 */
