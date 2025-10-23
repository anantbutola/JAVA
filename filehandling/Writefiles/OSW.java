package filehandling.Writefiles;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OSW {
    public static void main(String[] args) {
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("filehandling/ReadFile/demo.txt",true))){
            osw.write(System.lineSeparator());
            osw.write("Shlok of Bhagwat geeta");
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }


        }
    }

