package filehandling.Writefiles;

import java.io.FileWriter;
import java.io.IOException;

public class FR {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("filehandling/Writefiles/test.txt",true);) {
            fw.write("Shlok of Bhagwat geeta\r\n");
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}
