package filehandling.ReadFile;
import java.io.FileReader;
import java.io.IOException;
public class FR {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("filehandling/ReadFile/demo.txt")){
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char)letters);
                letters=fr.read();
            }
        }catch(IOException ie) {
            System.out.println(ie.getMessage());
        }
        }
    }

