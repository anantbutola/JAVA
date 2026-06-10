package Comparator_Comparable;

import java.util.ArrayList;
import java.util.List;

public class comparable_interface {
    static void main() {
    List<Stud> ls = new ArrayList<>();
    ls.add(new Stud(60,"Anant",21));
    ls.add(new Stud(65,"Ram",20));
    ls.add(new Stud(55,"Sam",25));
    ls.add(new Stud(78,"Sammy",26));
        System.out.println(ls);


    }
}
class Stud implements Comparable<Stud>{
    int age;
    String name;
    int weight;

    public Stud(int weight, String name, int age) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }



    @Override
    public int compareTo(Stud that) {
        // this method is called for current object
        // we will define our sorting logic here

        // sort basis on age
        if(this.age == that.age){    // if two age same,then compare basis of name lexicographically.
            return this.name.compareTo(that.name);    // string comparsion already define, no need to make custom comparison for that.
        }
        return this.age - that.age;
    }
}
/*
Comparable Interface
Purpose: Defines a natural ordering for the objects of the classes that implement it.
Method to implement: compareTo(T o)
Functionality: This method compares the current object with the specified object to determine their order.
Return Value: Returns a negative integer, zero or a positive integer as this object is less than, equal to, or greater than the specified object, respectively.
Usage Context: Useful when there is a single, natural ordering of the objects (e.g., alphabetical order for strings, numerical order for numbers).
Integration: Automatically used by sorting methods in collections that do not specify a custom comparator (e.g., Collections.sort(list) when sorting a list of objects that implement comparable).

 */