package oops;
/*
        Java only supports call by value. There is no call by reference in java.
        eg: int x = 5;
        int y =6;
        System.out.println("Original: "+ x + " "+ y);
        addTen(x,y);
        System.out.println("After adding: "+ x + " "+ y);

        static void addTen(int a, int b){
        a = a + 10;
        b = b + 10;
        }
        Here in stack memory, two variables  x and y form here with values initialized 5,6.
        when we call addTen() method ,in stack memory a and b also form there with values of x and y copied to them respectively.
        So, there is no actual values going to be changed , values changed but in copied blocks.
        And after function ends those memory blocks  in stack removed automatically.


        How can we change values then?Not by passing actual reference of object but by passing copy of reference of object.
        eg:
        // Main() function
        sum  s1 = new sum(5,6);
        System.out.println("Original: "+ s1.x + " "+ s1.y);         // x= 5  y=6
        addTen(s1);
        System.out.println("After adding: "+ s1.x + " "+ s1.y);     // x=15  y=16

        // class sum
        class sum{
        int x,y;
        sum(int x,int y){
        this.x=x;
        this.y=y;
            }

        // method
        static void addTen(sum s){
        s.x = s.x + 10;
        s.y = s.y + 10;
        }

        Here values going to be changed, b/c we're passing copy of reference of object.
        When we create, class sum object s1, s1 created in stack, and it points to the memory block where x and y stored in heap memory.
        and when we call the method where argument is sum class object(s).
        And s also created in stack memory but it contains the copy of address of s1..
        So it basically points same memory block in heap memmory.
        Therefore, any value change by these affect there also.



 */
public class callByValue_Reference {
    static void main() {
//        int x = 5;
//        int y =6;
//        System.out.println("Original: "+ x + " "+ y);
//        addTen(x,y);
//        System.out.println("After adding: "+ x + " "+ y);

        sum  s1 = new sum(5,6);
        System.out.println("Original: "+ s1.x + " "+ s1.y);         // x= 5  y=6
        addTen(s1);
        System.out.println("After adding: "+ s1.x + " "+ s1.y);     // x=15  y=16


    }
//    static void addTen(int a, int b){
//        a = a + 10;
//        b = b + 10;
//    }

    static void addTen(sum s){
        s.x = s.x + 10;
        s.y = s.y + 10;
    }
}
class sum{
    int x,y;
    sum(int x,int y){
        this.x=x;
        this.y=y;
    }
}
