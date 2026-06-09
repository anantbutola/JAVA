package collections;

import java.util.List;
import java.util.Stack;

/*
Java Stack
The Java collections framework has a class named Stack that provides the functionality of the stack data structure.
The Stack class extends the Vector class.
- stack follows LIFO(Last In , First Out) approach.
 */
public class collections_stack {
    static void main() {
        // Methods available for list also available for stack also

        // specific methods for stack:
        Stack<Integer> st= new Stack<>(); // this works
        List<Integer> list = new Stack<>();  // for this these specific methods not working
        // b/c reference is of List type.

        // push() - adding elements in stack
        st.push(10);
        st.push(12);
        st.push(15);
        System.out.println(st);

        // pop() - remove elements from top
        st.pop();
        System.out.println(st);

        //peek() - peek or see top element n stack
        System.out.println(st.peek());

        //search() - searching from top and return based on 1-based indexing.
        // if element not found return -1
        System.out.println(st.search(12));

        // empty() - checks stack is empty or not
        System.out.println(st.empty());
    }
}
