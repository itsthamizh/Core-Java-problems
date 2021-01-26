package learn.thread.Thread;

public class ThreadPoolExample implements Runnable{

    private String message;

    public ThreadPoolExample(String s){
        this.message= s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"(start) Message"+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+"(End)"+message);
    }

    public void processmessage(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
