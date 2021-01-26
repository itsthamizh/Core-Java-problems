package learn.thread.Thread;

public class ThreadCreating extends Thread {
    public static void main(String args[]){

        System.out.println("Thread name is : "+Thread.currentThread().getName());

        ThreadCreating thread1 = new ThreadCreating();
        ThreadCreating thread2 = new ThreadCreating();

        thread1.start();
       // thread1.setName("First Thread is Running");
        thread2.start();
        //thread2.setName("Second Thread is Running");

    }

    public void run(){

        System.out.println("Thread name is : "+Thread.currentThread().getName());


//        Thread t = Thread.currentThread();
//        String name = t.getName();
//        System.out.println("Thread name is : "+name);

    }
}
