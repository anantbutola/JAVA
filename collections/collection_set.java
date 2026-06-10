package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class collection_set {
    static void main() {
        // HashSet
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(10);
        System.out.println(st);

        Set<Integer> st2 = new HashSet<>();
        st2.add(20);
        st2.add(50);
        st2.add(60);

        // retainAll() - retains all the elements that are common to both sets.
        // simply intersection of both sets
        st.retainAll(st2);
        System.out.println(st);

        // containsAll() - checks the set is subset of another set or not.
        System.out.println(st);
        System.out.println(st2);
        System.out.println(st2.containsAll(st));  // st2 contains all elements of st.



        // LinkedHashSet -- duplicates not allowed , but preserve order.
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(10);
        ls.add(99);
        ls.add(20);
        ls.add(30);
        ls.add(10);
        System.out.println(ls);

        // TreeSet -- duplicates not allowed, but sorts the set.
        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(99);
        ts.add(29);
        ts.add(30);
        ts.add(10);
        System.out.println(ts);
    }
}
/*
Java Set Interface
The set interface of teh Java Collections framework provides the features of the
mathematical set in Java. It extends the Collection interface.
Unlike the List interface, sets cannot contain duplicate elements.

 -- HashSet( O(1) )
 A HashSet is a collection in Java that stores only unique elements and does not maintain any specific order.

When we say the “sequence can be anything,” it means that the elements are not
stored in the order you insert them, nor are they sorted. The position of elements depends on how hashing works internally,
so the output may appear random and can even change over time.

Methods:
Methods
add() - adds the specified element to the set.
addAll() - adds all the elements of the specified collection to the set.(UNION)
iterator() - returns an iterator that can be used to access elements of the set sequentially.
remove() - removes the specified element from the set.
removeAll() - removes all the elements from the set that is present in another specified set.(DIFFERENCE)
retainAll() - retains all the elements in the set that are also present in another specified set.(INTERSECTION)
clear() - removes all the elements from the set.
size() - returns the length (number of elements) of the set.
toArray() - returns an array containing all the elements of the set.
contains() - returns true if the set contains the specified element.
containsAll() - returns true if the set contains all the elements of the specified collection.(SUBSET)
hashCode() - returns a hash code value (address of the element in the set)

Why HashSet?
In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a
hash table are accessed using hash codes.
The hashcode of an element is a unique identity that helps to identify the element in a hash table.
HashSet cannot contain duplicate elements. Hence, each hash set elements a unique hashcode.
Note: It has a time complexity of O(1).


-- LinkedHashSet(  O(n) )
A LinkedHashSet is a collection in Java that stores unique elements (no duplicates) and
also maintains the order in which elements were inserted.
Implementation:
Set<Integer> ls = new LinkedHashSet<>();

-- TreeSet  (O(log n)) - Based on BST
A TreeSet is a collection in Java that stores unique elements
and automatically sorts them.
Implementation:



 */
