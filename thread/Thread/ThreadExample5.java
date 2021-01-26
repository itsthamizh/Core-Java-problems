package learn.thread.Thread;

public class ThreadExample5 {

    //This example using lamda method into creating the thread//
    public static void main(String[] args) {
        Runnable runnable = () -> {
//            System.out.println("Lamda thread is starting.....");
//            System.out.println("Lamda thread is ending......");
            String theThreadName = Thread.currentThread().getName();
            System.out.println(theThreadName+ " running");
        };

        Thread thread1 = new Thread(runnable,"First Thread");
        thread1.start();

        Thread thread2 = new Thread(runnable,"Second Thread");
        thread2.start();

        Thread thread3 = new Thread(runnable,"Third Thread");
        thread3.start();
    }
}
