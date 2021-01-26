package learn.IOStream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {
    public static void main(String args[]){
        byte[] by = {35,36,37,38};

        ByteArrayInputStream bytein = new ByteArrayInputStream(by);

        int k=0;
        while((k=bytein.read())!=-1){
            char ch = (char) k;
            System.out.println("Ascii value of character is: " +k+ "; Special Character is: "+ch);
        }
    }
}
