package learn.thread.DeadLock;

public class DeadLock {
    public static void main(String args[]) {

        // In this line for to creating two Objects
        final String resourse1 = "tamil";
        final String resourse2 = "english";

        //in this line for creating a First Thread
        Thread t1 = new Thread(){
            // this method for thread one's run() method
            public void run(){
                synchronized (resourse1){
                    System.out.println("i am in thread one in resourse1");
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    synchronized (resourse2){
                        System.out.println("i am in thread one in resourse2");
                    }
                }
            }
        };

        //in this for thread creating ffor second thread
        Thread t2 = new Thread(){
           // second threads run method
            public void run(){
                synchronized (resourse2){
                    System.out.println("i am in thread two in resourse2");
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    synchronized (resourse1){
                        System.out.println("i am in thread two in resourse1");
                    }
                }
            }
        };

        //staring to the first and second thread
        t1.start();
        t2.start();
    }
}