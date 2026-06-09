package collections;

import java.util.LinkedList;

/*
Java LinkedList
The LinkedList class of the Java collections framework provides the functionality of the linkedlist data structure (doubly linkedlist).

Each element in a linked list is known as a node.
It consists of 3 fields:
Prev - Stores an address of the previous element in the list. It is null for the first element.
Next - Stores an address of the next element in the list. It is null for the last element.
Data - stores the actual data.

 */
public class collections_linkedlist {
    static void main() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);ll.add(20);ll.add(30);ll.add(40);ll.add(50);
        System.out.println("Original list: "+ ll);
        // all methods we use for arraylist same applicable here also.
        LinkedList<Integer> ll1 = (LinkedList<Integer>) ll.clone();
        System.out.println("Clone list: "+ ll1);

        //Linked List as Queue & Deque
        //Since the LinkedList class also implements the Queue and the Deque interface,
        // it can implement methods of these interfaces as well.

        // addFirst and addLast - add given element in first and last index of linked list
        ll.addFirst(99);
        ll.addLast(99);
        System.out.println(ll);

        // removeFirst() and removeLast - remove first and last element in lnkedlist.
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        // getFirst and getLast - access first and last element of linked list
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // peek() - return first element of linkedlist
        System.out.println(ll.peek());

        //poll() - return and removes the first element from linkedlist
        System.out.println(ll.poll());
        System.out.println(ll);

        // offer() - adds specified element at last of linkedlist
        ll.offer(99);
        System.out.println(ll);
    }
}
