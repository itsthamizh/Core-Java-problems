package learn.IOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
    public static void main(String args[]){
        try {
            FileOutputStream fout = new FileOutputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "This is for input output read write program";
            byte name[]= s.getBytes();
            bout.write(name);
            bout.close();
            fout.close();
            System.out.println("Successfully writted...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
