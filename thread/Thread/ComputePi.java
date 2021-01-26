package learn.thread.Thread;

import java.math.BigDecimal;

public class ComputePi {
    private static BigDecimal result;

    public static void main(String arg[]){
        Runnable r = () ->{
          result = computePi(50000);
        };
        Thread  t = new Thread(r);
        t.start();
        try{
            Thread.sleep(2000);
            t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(result);
    }

    private static BigDecimal computePi(int i) {
        System.out.println("Hello : "+i);
        return null;
    }
}
