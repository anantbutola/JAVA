package filehandling.ObjectSerialization;

import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class OSconcept {
    public static void main(String[] args) {
        Student s1 = new Student(10,"Anant");
        Student s3 = new Student(12,"Butola");
        try(FileOutputStream fos = new FileOutputStream("filehandling/ObjectSerialization/Student.ser")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s3);
            System.out.println("Object  Serialized Successfully ");
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }

       try(FileInputStream fis = new FileInputStream("filehandling/ObjectSerialization/Student.ser")){
        ObjectInputStream ois = new ObjectInputStream(fis);
           System.out.println("Object  Deserialized Successfully ");
       while (true){
           try{
               Student s2 = (Student) ois.readObject();

               System.out.println("Roll No : "+s2.rollNo);
               System.out.println("Name : "+s2.name);
           }catch(EOFException ie){
              break;
           }
       }
       } catch (IOException | ClassNotFoundException e) {
           System.out.println("File not found" + e.getMessage());
       }

    }
}
