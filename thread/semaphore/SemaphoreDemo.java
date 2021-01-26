package learn.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String args[]){
        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Task implements Runnable{

    Semaphore semaphore = new Semaphore(2);
    
    @Override
    public void run(){
        try {
            semaphore.acquire();
                System.out.println("Being run by: "+Thread.currentThread().getName());
                for(int i=0;i<5;i++) {
                    System.out.println("Now Running: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            semaphore.release();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}