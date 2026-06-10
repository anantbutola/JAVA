package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class collection_queue {
    static void main() {
        Queue<Integer> q = new LinkedList<>();

        // add - add specific elemennt in queue
        // if addition is successful return true, otherwise throws exception.
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);

        // offer - same functionality of add method but when it failed to add element
        // it returns false rather than exception
        q.offer(60);
        System.out.println(q);

        // element and peek - return head of queue
        // if queue is empty, element throws exception and peek return null.
        System.out.println(q.peek());

        // remove and poll - returns and remove head of queue
        // if queue is empty, remove throws exception and poll return null.
        q.poll();
        System.out.println(q);



        // arrayDeque - array double ended queue
        Deque<Integer> ad = new ArrayDeque<>();
        ad.offer(10);
        ad.offerFirst(20);
        ad.offerLast(30);
        System.out.println(ad);

        ad.pollFirst();
        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);

        System.out.println(ad.peek());
    }
}
/*
Java Queue Interface
The Queue interface of the Java collections framework provides the functionality
of the queue data structure. It extends the collection interface.
 - It follows FIFO(First-In , First-Out) approach.

 Implementation:
 // LinkedList implementation of Queue
Queue<String> animal1 = new LinkedList<>();

// Array implementation of Queue
Queue<String> animal2 = new ArrayDeque<>();

// Priority Queue implementation of Queue
Queue<String> animal3 = new PriorityQueue<>();


Deque Interface in Java Collections Framework
Deque stands for Double Ended Queue.
It is an interface in the Java Collections Framework that allows insertion and deletion
from both ends (front and rear).

Implementation:
Deque<Integer> dq = new ArrayDeque<>();
Deque<Integer> dq = new LinkedList<>();

methods: addFirst,addLast,removeFirst,removeLast,getFirst,getLast.

* Array Double Ended Queue :
Stack/Queue Operations using ArrayDeque
Stack Operations: push(), pop()
Queue Operations: add(), remove()

Internal Working:
Despite the name ArrayDeque, it is not a simple fixed-size array.
Internally it uses a resizable circular array.

Example: [10,20,30,40]
When front elements are removed, it reuses free spaces efficiently instead of shifting all elements.
This makes insertion/removal at both ends O(1).

 */
