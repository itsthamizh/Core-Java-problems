package learn.IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
