package Threads.Interrupts;

public class InterruptWorkingThread {
    public static void main(String[] args) {
        // Creating a new thread t1 using a lambda expression
        Thread t1 = new Thread( ()->{
            // Print 50 process messages
               for (int i = 0; i < 50; i++) {
                   System.out.println("processes: "+i);
               }
            for (int i = 0; i < 1000000000; i++){    //HeavyLoop(Do-nothing)
                if(Thread.interrupted()){
                    System.out.println("t1 thread interupted. Stopping...");
                    return;    //Exit Thread
                }
            }

        } );
        //Main Thread Starts Thread-t1
        t1.start();

        try{
            Thread.sleep(100);       //Main Thread Sleeps for 100ms
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("main thread interupted. Stopping...");
        t1.interrupt();     //Main Thread Interrupts Thread-t1.
    }

}
