package learn.thread.Thread;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.*;

public class PoolExecutor {
    public static void main(String args[]) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        executor.schedule(new MyRunnable(),1000, MILLISECONDS);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My Runnable");
    }
}






//        AtomicInteger counter = new AtomicInteger();
//        ExecutorService excecutor = Executors.newSingleThreadExecutor();
//
//        excecutor.submit(()->{
//            counter.set(1);
//
//        });
//        excecutor.submit(()->{
//           counter.compareAndSet(1,2);
//           System.out.println("Hiii");
//        });

















//        ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//
//        pool.submit(()->{
//            try {
//                Thread.sleep(1000);
//               // System.out.println("hi");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return null;
//        });
//
//        pool.submit(()->{
//            try {
//                Thread.sleep(1000);
//                //System.out.println("hello");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return null;
//        });
//
//        pool.submit(()->{
//            try {
//                Thread.sleep(1000);
//               // System.out.println("how are you");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return null;
//        });
//    assertEquals(3,pool.getPoolSize());
//    assertEquals(3,pool.getPoolSize());
//    }
//
//    private static void assertEquals(int i, int poolSize) {
//
//    }
