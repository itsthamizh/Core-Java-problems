package learn.thread.DeadLock;

public class DeadLockExample {
    public static void main(String args[]){
        String name1 = "tamil";
        String name2 = "english";

        Thread thread1 = new Thread(){
          public void run(){
              synchronized (name1){
                  System.out.println("Thread 1: Locked Resource ");
                  try{
                    Thread.sleep(1000);
                  }
                  catch (Exception e){
                      System.out.println(e);
                  }
              }
          }
        };
    }
}
