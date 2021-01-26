package learn.IOStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout1 = new FileOutputStream("/home/linux/springboot/demo/src/learn/IOStream/sample");
        FileOutputStream fout2 = new FileOutputStream("/home/linux/springboot/demo/src/learn/IOStream/demo");

        ByteArrayOutputStream byteout = new ByteArrayOutputStream();

        byteout.write(65);

        byteout.writeTo(fout1);
        byteout.writeTo(fout2);

        byteout.flush();

        byteout.close();

        System.out.println("Success fully completed....");
    }
}
