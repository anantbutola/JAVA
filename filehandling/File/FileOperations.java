package filehandling.File;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class FileOperations {
    public static void main(String[] args) {

        //CREATE NEW FILE
        try {
            File fo = new File("filehandling/File/example.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //WRITE IN FILE
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filehandling/File/example.txt"))) {
        bw.write("\"गुरुर्ब्रह्मा गुरुर्विष्णुर्गुरुर्देवो महेश्वरः । गुरुः साक्षात् परं ब्रह्म तस्मै श्रीगुरवे नमः ॥\"");

        } catch (IOException ie){
            System.out.println(ie.getMessage());
        }

        //READ IN FILE
        try(BufferedReader br = new BufferedReader(new FileReader("filehandling/File/example.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //DELETE FILE
        try {
            File fo = new File("filehandling/File/random.txt");
            fo.createNewFile();
            if (fo.delete()){
                System.out.println(fo.getName() + " is deleted.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
