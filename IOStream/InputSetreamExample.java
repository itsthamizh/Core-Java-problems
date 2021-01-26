package learn.IOStream;

import java.io.FileInputStream;

public class InputSetreamExample {
    public static void main(String args[]){
        try{
            FileInputStream in = new FileInputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
            int i = in.read();
            System.out.println("Getted line is : ");
            System.out.println((char)i);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
