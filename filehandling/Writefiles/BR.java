package filehandling.Writefiles;

import java.io.*;

public class BR {
    public static void main(String[] args) {
        try(BufferedWriter br = new BufferedWriter(new FileWriter("filehandling/Writefiles/test.txt",true)){}){
            br.write("Hello there java is good for DSA");
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}
