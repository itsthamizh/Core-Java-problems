package learn.IOStream;

import java.io.Console;

public class ConsoleReadPasswordExample {
    public static void main(String args[]){
        Console c = System.console();
        System.out.println("Enter password :");
        char[] ch = c.readPassword();
        String pass= String.valueOf(ch);
        System.out.println("Your password is :"+pass);
    }
}
