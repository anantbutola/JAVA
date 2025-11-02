package COLLEGE_ASSIGNMENTS;
/*
14. Create two threads in Java — one to print numbers from 1 to 10 and another to print letters
from A to J. Run both threads simultaneously.
 */
class A1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Count No. :"+i);
        }
    }
}
class A2 extends Thread{
    public void run(){
        for(int i=65;i<=74;i++){
            System.out.println("Alphabet :"+ (char)i);
        }
    }
}
public class DemoThread {
    public static void main(String[] args) {
   A1 t1 = new A1();
   A2 t2 = new A2();
   t1.start();
   t2.start();
    }
}
