package learn.thread.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnotherTestThread {
    static final int size = 10;
    public static void main(String args[]){
        Runnable r1 = new Threadfirst("First");
        Runnable r2 = new Threadfirst("Second");
        Runnable r3 = new Threadfirst("Third");
        Runnable r7 = new Threadfirst("Extra-First");

        Runnable r4 = new Threadsecond("Fourth");
        Runnable r5 = new Threadsecond("Fifth");
        Runnable r6 = new Threadsecond("Sixth");
        Runnable r8 = new Threadsecond("Extra-Second");

        ExecutorService pool = Executors.newFixedThreadPool(size);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r7);

        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r8);

        pool.shutdown();
    }

}

class Threadfirst implements Runnable{
    private String Name;

    Threadfirst(String name){
        this.Name=name;
    }
    public void run(){
           // System.out.println("Thread Id is :"+ Name +" = "+Thread.currentThread().getId());
            System.out.println("Thread Name is: "+ Name +" = "+Thread.currentThread().getName());
    }
}

class Threadsecond implements Runnable{
    private String Name;

    Threadsecond(String name){
        this.Name=name;
    }
    public void run(){
        //System.out.println("Thread Id is : " + Name+" = "+Thread.currentThread().getId());
        System.out.println("Thread Name is: "+ Name+" = "+Thread.currentThread().getName());
    }
}