package filehandling.que1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class check1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos =null;
        try{
            fis = new FileInputStream("filehandling/que1/demo.txt");
            fos = new FileOutputStream("filehandling/que1/test.txt");
            while(fis.available()>0){
                int letter = (char)fis.read();
                fos.write(letter);
            }
        }catch (IOException ie){

        }
    }
}
