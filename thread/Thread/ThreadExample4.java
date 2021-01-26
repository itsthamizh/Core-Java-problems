package learn.thread.Thread;

public class ThreadExample4 {
    public static void main (String args[]){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running is started......");
                System.out.println("Thread running is ended.......");
            }
        };
//        Runnable can = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("this for second thread is started.......");
//                System.out.println("this for second thread is ended......");
//            }
//        };

        Thread thread1 = new Thread(runnable, "First Thread ");
        thread1.start();
//        Thread thread2 = new Thread(can);
//        thread2.start();

    }
}
