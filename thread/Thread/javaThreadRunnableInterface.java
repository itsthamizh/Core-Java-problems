package learn.thread.Thread;

public class javaThreadRunnableInterface implements Runnable {

    public static void main(String args[]){
        javaThreadRunnableInterface obj = new javaThreadRunnableInterface();
        Thread thread = new Thread(obj);
        thread.start();
    }

    public void run(){
        System.out.println("Thread is Running........");
    }
}
