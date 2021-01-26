package learn.thread.Thread;

public class PriorityThread {
    public static void main(String[] args){
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();
        PriorityThread thread3 = new PriorityThread();

       // thread1.setDameon(true);

        thread1.run();
        thread2.run();
        thread3.run();
    }

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is working...");
        }
        else{
            System.out.println("user thread is working..");
        }
    }
}