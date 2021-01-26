package learn.thread.Thread;

public class ExampleThread extends Thread {

    public static void main (String args[]) throws InterruptedException {

        System.out.println("Hello World");
        ExampleThread thread1 = new ExampleThread();
        ExampleThread thread2 = new ExampleThread();
        thread1.setName("First        thread1.join(); Thread");
        thread2.setName("Second Thread");


        thread1.sleep(2000);
        System.out.println("hii");

        thread1.join();

        thread1.start();

        thread2.start();
        System.out.println("Hello");

    }


    public void run(){

        System.out.println(Thread.currentThread().getId());

//        String theThreadName = Thread.currentThread().getName();
//        System.out.println(theThreadName);
    }
}
