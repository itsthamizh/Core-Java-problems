package learn.thread;

public class ArithmaticThreadException {
    public static void main(String args[]) throws InterruptedException {
        Thread thread = new Thread(new myRunnable());
        thread.start();
        thread.join();
        System.out.println("......");
    }

}
class myRunnable implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int a = 10 / 0;
            System.out.println("HelloWorld");
    }
}
