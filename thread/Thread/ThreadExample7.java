package learn.thread.Thread;

public class ThreadExample7 {

    public static void main(String[] args){

        Runnable runnable = () -> {

            String theThreadName = Thread.currentThread().getName();
            System.out.println(theThreadName + " Running");
                try {
//                    System.out.println(theThreadName + " Running");
                    Thread.sleep(2000);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            System.out.println(theThreadName+ " edded");

        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
