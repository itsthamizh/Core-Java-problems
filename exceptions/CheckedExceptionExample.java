package learn.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main (String args[]) throws Exception{
        FileReader file = new FileReader("/home/linux/springboot/demo/src/learn/exceptions/sample");
        BufferedReader fileInput = new BufferedReader(file);

        for(int count=0; count<3;count++){
            System.out.println(fileInput.readLine());
        }

        fileInput.close();
    }
}
