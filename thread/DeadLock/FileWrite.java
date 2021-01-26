package learn.thread.DeadLock;

import java.io.*;
import java.io.FileReader;

import java.io.BufferedReader;
import java.io.FileWriter;


class FileAccess extends Thread{
        @Override
        public  void run(){
            try {
                for (int i = 0; i < 10; i++) {
                    BufferedReader reader =  new BufferedReader(new FileReader("/home/linux/springboot/demo/src/learning/thread/DeadLock/new"));
                    int a = Integer.parseInt(reader.readLine().replace("\n", ""));
                    reader.close();
                    System.out.println(Thread.currentThread().getName()+ " " + String.valueOf(a));
                    a = a + 1;
                    BufferedWriter writer = new BufferedWriter(new FileWriter("/home/linux/springboot/demo/src/learning/thread/DeadLock/new"));
                    writer.write(String.valueOf(a));
                    writer.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

}


public class FileWrite {
    public static void main(String args[]) {
        System.out.println(Thread.currentThread().getName());
        FileAccess thread1= new FileAccess();
        FileAccess thread2 = new FileAccess();
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        thread1.start();
        thread2.start();
    }
}















