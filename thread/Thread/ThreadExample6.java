package learn.thread.Thread;

public class ThreadExample6 {

    public static void main(String[] args){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " running");
            }
        };
        Thread thread1 = new Thread(runnable,"1st Thread ");
        thread1.start();

        Thread thread2 = new Thread(runnable,"2nd Thread ");
        thread2.start();

        Thread thread3 = new Thread(runnable,"3rd Thread ");
        thread3.start();
    }
}
