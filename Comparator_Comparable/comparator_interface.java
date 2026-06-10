package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator_interface {
    static void main() {
        List<School> ls = new ArrayList<>();
        ls.add(new School(60,"Anant",21));
        ls.add(new School(65,"Ram",20));
        ls.add(new School(55,"Sam",25));
        ls.add(new School(78,"Sammy",26));
        System.out.println(ls);


        // this is one way of using comparator
//        Collections.sort(ls, new Comparator<School>() {
//            @Override
//            public int compare(School o1, School o2) {
//               return o1.weight - o2.weight;
//            }
//        });
        Collections.sort(ls,new WeightComparator());


        // using lambda
        Collections.sort(ls,(a,b)-> a.weight - b.weight);
        System.out.println(ls);
    }
}


class School  {
    int age;
    String name;
    int weight;

    public School(int weight, String name, int age) {
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
}

// another way of using comparator
class WeightComparator implements Comparator<School>{

    @Override
    public int compare(School o1, School o2) {
        return o1.weight - o2.weight;
    }
}

/*
Comparator Interface
Purpose: Provides a way to define a custom order for objects, separate from their natural ordering.
Method to Implement: compare(T o1, T o2)
Functionality: Compares its two arguments for order.
Return Value: Returns a negative integer, zero, or positive integer as the argument is less than, equal to, or greater than the second.
Usage Context: Ideal when you need multiple different ways of ordering objects, or when objects do not have a natural ordering.
Flexibility: Allows specifying the order externally, which is useful for sorting methods when you want to sort based on attributes that are not considered in natural ordering.
Integration: Used by providing an instance of Comparator to sorting methods, such as Collections.sort(list, comparator) or Arrays.sort(array, comparator).

 */
