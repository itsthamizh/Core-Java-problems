package learn.IOStream;

import java.io.FileOutputStream;

public class OutputStreamUsingString {
    public static void main(String args[]){
        try {
            FileOutputStream out = new FileOutputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            String s = "it is for tamizh @ 12 34 56";
            byte b[]=s.getBytes();
            out.write(b);
            out.close();
            System.out.println("Success fully writted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
