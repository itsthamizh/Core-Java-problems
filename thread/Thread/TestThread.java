package learn.thread.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    // Step 1 - is Create a class Runnable object //

    private String name;

     Task( String name){
        this.name=name;
    };

    public void run(){
        try{
            for(int i=0;i<=5;i++){
                if(i==0){
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for "
                            + "task time - "+name+ " = "+ft.format(d));
                }
                else{
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing time for task name - "+ name +" = "+ft.format(d));
                }
                Thread.sleep(2000);
            }
            System.out.println(name + "complete");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class TestThread {
    // This below for how many threads in allowed to the pool //
    static final int max_thread = 3;


    public static void main (String[] args){
        // Create a Objects for Runnable interface for five tasks //
        Runnable r1 = new Task("task_1");
        Runnable r2 = new Task("task_2");
        Runnable r3 = new Task("task_3");
        Runnable r4 = new Task("task_4");
        Runnable r5 = new Task("task_4");

        // Step - 2 //
        //This below line for Thread pool creation //
        ExecutorService pool = Executors.newFixedThreadPool(max_thread);

        // Step - 3 //
        //Passes the tasks object to the pool to execute //
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // step - 4 //
        //This below line for ShutDown the Thread - pool object//
        pool.shutdown();
    }
}

