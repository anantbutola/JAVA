package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class custom_class_hashset {
    static void main() {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student(10,"Anant");
        Student s2 = new Student(10,"Anant");
        Student s3 = new Student(10,"Anant");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());
    }
}
class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)    //same object?
            return true;

        if (obj == null)    // null?
            return false;

        if(getClass() != obj.getClass())    // same class?
            return false;

        Student s = (Student)obj;       //casting
        return rollno == s.rollno && name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno,name);
    }
}
/*
Why do we need equals() and hashCode()?
Suppose:
Student s1 = new Student(1, "Anant");
Student s2 = new Student(1, "Anant");
Logically both students are the same.

But by default Java compares memory addresses, so:
s1.equals(s2);   // false

To compare the actual data, we override:

* equals() → Checks if data is equal.
* hashCode() → Generates hash value for storage in HashSet/HashMap.

How HashSet Works?
When you do:
set.add(student);
HashSet performs:
1. hashCode()  -> Find bucket
2. equals()    -> Check duplicate in that bucket


equals() Template:
@Override
public boolean equals(Object obj) {

    if (this == obj)
        return true;

    if (obj == null || getClass() != obj.getClass())
        return false;

    Student s = (Student) obj;

    return rollno == s.rollno &&
           name.equals(s.name);
}

Think: SNDC
-- S = Same Object?
if(this == obj)
    return true;

-- N = Null?
if(obj == null)
    return false;

-- D = Different Class?
if(getClass() != obj.getClass())
    return false;

-- C = Compare Fields
return rollno == s.rollno &&
       name.equals(s.name);

 hashCode() Template:
 @Override
public int hashCode() {
    return Objects.hash(rollno, name);
}

Remember: Fields used in equals(),must also be used in hashCode()
 */
