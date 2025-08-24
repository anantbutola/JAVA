package COLLEGE_ASSIGNMENTS;

// package oops.assignments;

class Human {
    String name; // non-static variable
    static int population = 0; // static variable
    static int a = 10;
    static int b;
    static { // static block
        System.out.println("Inside Static Block");
        b = a * 5;
    }
    
    Human(String name) {
        this.name = name;
        Human.population += 1;
    }

    void show() {
        System.out.println("value of b : " + Human.b );
    }

    static void display() { // static method
        System.out.println("Total Population is : " + Human.population);
    }

    void greet() { // non-static method
        System.out.println("Name is : " + this.name);
    }
}

public class StaticNonstatic {
    public static void main(String[] args) {
      Human H1 =new Human("Anant");
      Human H2 =new Human("Maya");
      H1.greet();
      H2.greet();
      Human.display();
      H1.show();
      H2.show();
    }
}
