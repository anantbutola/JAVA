package filehandling.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR {
    public static void main(String[] args) {
        try{
            System.out.println("Enter something:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
            String a =br.readLine();
            System.out.println("OUTPUT :"+ a);
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }

        try{

            BufferedReader br = new BufferedReader(new FileReader("filehandling/ReadFile/demo.txt")) ;
            String a =br.readLine();
            System.out.println("OUTPUT :"+ a);
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}
