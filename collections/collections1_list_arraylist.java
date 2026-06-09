package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
Java Collection Framework: It provides  set of interfaces and classes to implement various data structures and algorithms.
Example: The linkedlist class of the collections framework provdes the implementation of the doubly-linked list data.
 ── Collection (interface)
    ├── List (interface)
    │   ├── ArrayList
    │   ├── LinkedList
    │   └── Vector
    │       └── Stack
    │
    ├── Set (interface)
    │   ├── HashSet
    │   │   └── LinkedHashSet
    │   └── SortedSet (interface)
    │       └── TreeSet
    │
    └── Queue (interface)
        ├── PriorityQueue
        └── Deque (interface)
            ├── ArrayDeque
            └── LinkedList

Map (interface)  ← separate hierarchy
├── HashMap
│   └── LinkedHashMap
├── Hashtable
│   └── Properties
└── SortedMap (interface)
    └── TreeMap

-> Common Methods of Collection
The Collection interface includes various methods that can be used to perform different operations on objects.
These methods are available in all its sub-interfaces.

add() - inserts the specified element to the collection
size() - returns the size of the collection
remove() - removes the specified element from the collection
iterator() - returns on iterator to access elements of the collection
addAll() - adds all the elements of a specified collection to the collection
removeAll() - removes all the elements of the specified collection from the collection
clear() - removes all the elements of the collection.

* Java List Interface:
In Java, the List interface is an ordered collection that allows us to store and access element sequentially.

How to use it ?  List is an interface , we cannot create objects of interface. "ArrayList" is a concrete class which implements List Interface.
So, we can create object of class only.
// ArrayList implementation of List

List<String> list1 = new ArrayList<>();

// LinkedList implementation of List
List<String> list2 = new LinkedList<>();

Methods of list:
add() - adds an element to a list.
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists.
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list.
clear() - removes all the elements from the list (more efficient thatn removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true is a list contains specific element.

* Java ArrayList:
In Java, we use the ArrayList class to implement the functionality of resizable-arrays.
It implements the List interface of the collections framework.
 */
public class collections1_list_arraylist {
    static void main() {
    // List or collections -> interfaces(no object creation possible)
        List<Integer> list = new ArrayList<>();
        // add elements - sequentially
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        //remove elements from specific index
        list.remove(0);
        System.out.println(list);

        // addAll - add elements of another list to given list.
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list.addAll(list2);
        System.out.println(list);

        // removeAll - remove all elements of list from another list.
        list.removeAll(list2);
        System.out.println(list);

        // size-list size
        System.out.println(list.size());

        //clear-removes all elements of list
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

        // iterator() - standard way to traverse over any data structure.
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){  // checks next element available or not - return true/false
            System.out.println("Element: "+ it.next());    //for printing that element
        }

        // get(index) - any element from specific index
        System.out.println(list.get(1));

        //set(index,integer_val) - change any element value of specific index
        System.out.println(list.set(1,90));
        System.out.println(list);

        //toArray() - convert any collection into array.
        Object[] arr1 =list.toArray();
        for(Object obj: arr1){
            System.out.println(obj);
        }

        //contains: is element present or not?
        System.out.println(list.contains(90));


        // ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(28);arr.add(13);arr.add(4);arr.add(50);
        System.out.println(arr);

        //sort arraylist
        Collections.sort(arr);
        System.out.println(arr);

        // descending order sort
        // Collections.reverseOrder() is a built-in Comparator that reverses the natural order.
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);

        // clone() - creates new arraylist with same element,size and capacity.
        ArrayList<Integer> newList = (ArrayList<Integer>) arr.clone();
        System.out.println(newList);

        // ensureCapacity() - ensureCapacity() is a method of ArrayList that increases
        // its internal capacity in advance to avoid multiple resizings when adding many elements.
        //As elements are added, the internal array may become full and Java creates a larger array and copies all
        // elements to it. This resizing takes time.
        ArrayList<Integer> List = new ArrayList<>();
        List.ensureCapacity(1000);

        //isEmpty() - check list is empty or not
        System.out.println(List.isEmpty());

        //indexOf() - returns the index of given element
        System.out.println(arr.indexOf(4));

        


    }
}

