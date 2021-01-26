package learn.IOStream;

import java.io.FileOutputStream;

public class OutputStreamExample {
    public static void main(String args[]){
        try{
            FileOutputStream out = new FileOutputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            out.write(69);
            out.close();
            System.out.println("Success fully writted....");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
