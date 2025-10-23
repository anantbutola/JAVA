package Threads;

public class PausingExecutionWithSleep {
    public static void main(String[] args) {
        String[] info = {
                "Anant Butola",
                "Lives in Srinagar Garhwal",
                "College is in Dehradun",
                "Intelligent Person"
        };
        try{
            for (int i = 0; i < info.length; i++) {
                Thread.sleep(4000);        //Pause for 4-seconds
                System.out.println(info[i]);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}


/*
- Thread.sleep causes the current thread to suspend execution for a specified period.
- This is an efficient means of making processor time available to the other threads
   of an application or other applications that might be running on a computer system.
- Two overloaded versions of sleep are provided: one that specifies the sleep time to
   the millisecond and one that specifies the sleep time to the nanosecond.
- sleep() method might throw InterruptedException.
 */