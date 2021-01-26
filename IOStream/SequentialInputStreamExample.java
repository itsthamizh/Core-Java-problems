package learn.IOStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequentialInputStreamExample {
    public static void main(String args[]){
        try{
            FileInputStream fin1 = new FileInputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            FileInputStream fin2 = new FileInputStream("/home/linux/springboot/demo/src/learn/IOStream/demo");
            SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
            int i;
            while ((i=sin.read())!=-1){
                System.out.print((char)i);
            }
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
