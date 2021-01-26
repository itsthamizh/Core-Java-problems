package learn.thread.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPoolExample {
    public static void main (String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            Runnable workers = new ThreadPoolExample(""+ i);
            executor.execute(workers);
        }
        executor.shutdown();
        while(!executor.isTerminated()){

        }
        System.out.println("Finished all threads");
    }
}
