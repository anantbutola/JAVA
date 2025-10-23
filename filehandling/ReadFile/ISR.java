package filehandling.ReadFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class ISR {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        try(InputStreamReader isr = new InputStreamReader(System.in)){ //System.in because we take input from user
            System.out.print("Enter some letters:");
            int letters = isr.read();
            while (isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try{
            FileInputStream fis = new FileInputStream("filehandling/ReadFile/demo.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}
/*
InputStreamReader(Character Stream Type) - InputStreamReader is a class that acts as a bridge between byte streams and character streams.
-InputStreamReader reads bytes from an InputStream (like a file or network connection) and decodes them into characters using a specified character encoding (like UTF-8).
-It is subclass of Reader class.
-Most file data is stored as bytes, but in Java, we often want to work with characters or text.
 The InputStreamReader converts these bytes into characters so we can easily read text files.
- It might throw IOException, so properly handle it in try-catch block.
- read() method: Reads one byte or (character) at a time in file or String . Returns integer value.
    Returns Unicode value of that particular character.
- ready() method: Checks if it is available to read character.Returns true/false.
 Constructors of ISR:
 -InputStreamReader isr = new InputStreamReader(System.in)  // Reads User Input from keyboard

 - FileInputStream fis = new FileInputStream("filehandling/ReadFile/demo.txt");   //give path of file and do changes then
   InputStreamReader isr = new InputStreamReader(fis);

-FileInputStream : It is a byte-based input stream used to read data from files.
- It is subclass of Input Stream. And Input Stream is subclass of Byte Stream.
Eg: FileInputStream fis = new FileInputStream("File_path");
*/