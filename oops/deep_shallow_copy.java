package oops;

public class deep_shallow_copy {
    static void main() {
    Random a = new Random(10,12);
    Random b = new Random(a);
    Random c = a;


    }
}
class Random{
    int x,y;
    Random(int x,int y){
        this.x = x;
        this.y =y;
    }
    Random(Random r){
        this.x  = r.x;
        this.y = r.y;
    }
}
/*
        Deep copy: Creates new object and copies all the instances of given object in itself.and it is totally independent of others.
         eg:
        Random a = new Random(10,12);
        Random b = new Random(a);
        Here, b contains copy of instances of object a.
        Means, "a" present in stack, and it points to memory location in heap where 10 and 12  stored.
        "b" present in stack, and it points different memory location in heap where 10 and 12 stored.
        changes done by "a" not affect b and vice versa....



        Shallow Copy: Creates new reference and it contains address of old object.
        eg:
        Random a = new Random(10,12);
        Random c = a;

        Here "a" present in stack and it points memory location present in heap.
        and "c" copies reference of "a" and also points towards same memory location iin heap.
        Changes done by 'c' reflect on "a" also.



 */
