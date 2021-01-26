package learn.thread.Thread;

public class ThreadGroupsExample implements Runnable {

    public static void main(String[] args){

        ThreadGroupsExample runnable = new ThreadGroupsExample();

         ThreadGroup tg1 = new ThreadGroup("Parant thread Group");

         Thread t1 = new Thread(tg1, runnable,"one");
         t1.start();

         Thread t2 = new Thread(tg1, runnable,"two");
         t2.start();

         Thread t3 = new Thread(tg1, runnable, "Three");
         t3.start();

         Thread t4 = new Thread(tg1, runnable,"last-thread");
         t4.start();

         System.out.println("Thread Group name :"+tg1.getName());

         tg1.list();
    }

    public void run(){

        System.out.println(Thread.currentThread().getName());
    }

}
