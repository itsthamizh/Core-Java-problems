package learn.thread.Thread;

public class ShutdownHookExample {

        public static void main(String args[]) throws Exception{
            Runtime r = Runtime.getRuntime();
            r.addShutdownHook(new Mythread());

            System.out.println("Now main sleeping....Press ctl+c to exit");
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.out.println("Exception Error for this :"+e);
            }
        }
}

class Mythread extends Thread{
    public void run(){
        System.out.println("Shut down hook task is competed");
    }
}
