package learn.thread.Thread;

public class ThreadExample10 extends Thread{

    public static void main(String[] args){
        ThreadExample10 thread1 = new ThreadExample10();
        ThreadExample10 thread2 = new ThreadExample10();
        ThreadExample10 thread3 = new ThreadExample10();

        thread1.start();

        try{
            thread1.join(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        thread2. start();
        thread3.start();
    }

    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
