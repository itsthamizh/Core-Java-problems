package learn.IOStream;

import java.io.FileInputStream;

public class InputStreamReadAllCharachter {
    public static void main(String args[]){
        try {
            FileInputStream in = new FileInputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            int i=0;
            while ((i=in.read())!=-1){
                System.out.print((char)i);
            }
            in.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
