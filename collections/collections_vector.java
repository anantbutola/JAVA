package collections;

import java.util.Vector;

/*
Java Vector
The Vector class is an implementation of the List interface that allows us to create resizable-arrays similar to the ArrayList class.

Vector vs ArrayList
-In Java, both ArrayList and Vector implements the List interface and provides the same functionalities. However, there exist some differences between them.
-The Vector class synchronizes each individual operation. This means whenever we want to perform some operation on vectors, the Vector class automatically applies a lock to that operation.
-It is because when one thread is accessing a vector, and at the same time another thread tries to access it, an exception called ConcurrentModificationException is generated. Hence, this continuous use of lock for each operation makes vectors less efficient.
-However, in array lists, methods are not synchronized. Instead, it uses the Collections.synchronizedList() method that synchronizes the list as a whole.
-It is recommended to use ArrayList in place of Vector because vectors less efficient.
 */
public class collections_vector {
    static void main() {
        Vector<Integer> vec = new Vector<>();
        // all methods available for arraylist, vector has same methods as well.
        
    }
}
