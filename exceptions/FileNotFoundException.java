package learn.exceptions;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String args[]){
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        }
//        catch (FileNotFoundException e) {
//            System.out.println("File does not exist");
//        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("File not found Exception ");
        }
    }
}
