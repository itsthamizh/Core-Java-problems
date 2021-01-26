package learn.thread.Thread;

public class Sleep extends Thread{
    public static void main(String args[]){
        Sleep sleep = new Sleep();
        Thread thread = new Thread(sleep);

        //sleep.start();

        thread.start();
    }

    public void run() {
        int i;
        for (i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("thamizh");
        }
    }
}