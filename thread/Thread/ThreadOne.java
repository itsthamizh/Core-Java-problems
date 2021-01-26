package learn.thread.Thread;

public class ThreadOne extends Thread{

    public static void main(String args[]){
        Thread thread = Thread.currentThread();
        childclass obj1 = new childclass();
        secondchildclass obj2 = new secondchildclass();

        System.out.println("Current thread : "+thread.getId());
        System.out.println("Current thread :"+thread.getName());
        thread.setName("thamizh");
        System.out.println("Current thread :"+thread.getName());

        System.out.println("Current thread : "+obj1.getId());
        System.out.println("Current thread :"+obj1.getName());

        System.out.println("Current thread : "+obj2.getId());
        System.out.println("Current thread :"+obj2.getName());
    }

}

class childclass extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("thread is running......."+i);
        }
    }

}

class secondchildclass extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread is running......"+i);
        }
    }
}