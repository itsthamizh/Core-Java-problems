package learn.thread.Thread;

public class gfg1 {
    public static void main(String args[]){
        multithraing obj1 = new multithraing();
        multivalue obj2 = new multivalue();
        multicont obj3 = new multicont();
        obj1.start();
        obj2.start();
        obj3.run();
    }
}

class multithraing extends  Thread{
    public void run(){
        int n=5;
        for(int i=0;i<n;i++){
            try{
                Thread.sleep(2000);
                System.out.println("1-Thread is "+ Thread.currentThread().getName() + "is running");
            }
            catch(Exception e){
                System.out.println("Exception handling error........ ");
            }
        }
    }
}

class multivalue extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("2-thread is " + Thread.currentThread().getName() + "is running");
            } catch (Exception e) {
                System.out.println("Exception Handling error......\n");
            }
        }
    }
}

class multicont implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("3-thread is " + Thread.currentThread().getName() + "is running");
            } catch (Exception exception) {
                System.out.println("Exception Handling error.......\n");
            }
        }
    }
}