package COLLEGE_ASSIGNMENTS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
16. Write a program to copy the contents from one file to another using FileInputStream and
FileOutputStream.
 */
public class CopyFileInAnotherFile {
    public static void main(String[] args) {
     try{
         FileInputStream fis = new FileInputStream("COLLEGE_ASSIGNMENTS/random.txt");
         FileOutputStream fos = new FileOutputStream("COLLEGE_ASSIGNMENTS/demo.txt");

         int data =  fis.read();
         while(data !=-1){
            fos.write((char)data);
            data = fis.read();
        }
     }catch(FileNotFoundException fe){
         System.out.println(fe.getMessage());
     }catch (IOException ie){
         System.out.println(ie.getMessage());
     }

    }
}
