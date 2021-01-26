package learn.thread.Thread;

public class ThreadExample3 {

    //Here this program for using Runnable and @Override annotations//
    public static class myRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread running is starting.....");
            System.out.println("Thread running is ending.......");
        }
    }

    public static class myrunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Scond thread is running......");
            System.out.println("Secong thread is ending......");
        }
    }

    public static void main(String args[]){
        //here creating for a object in thread class//
        Thread thread = new Thread(new myRunnable());
        //using thread object to start the run method//
        thread.start();

        Thread thread1 =  new Thread(new myrunnable());
        thread1.start();
    }
}
