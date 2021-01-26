package learn.thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        final ReentrantLock lock = new ReentrantLock();

        class worker implements Runnable{

            private final String name;

            worker(String name){
                this.name=name;
            }

            @Override
            public void run(){
                lock.lock();
                try{
                    if (lock.isHeldByCurrentThread()){
                        System.out.printf("Thread %s entered critical section.%n",name);
                        System.out.printf("Thread %s performing work.%n",name);
                        try{
                            Thread.sleep(2000);
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("printing has finished....");
                }
                finally {
                    lock.unlock();
                }
            }
        }

        executor.execute(new worker("Thamizh"));
        executor.execute(new worker("English"));
        try{
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
