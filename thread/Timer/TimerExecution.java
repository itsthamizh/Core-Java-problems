package learn.thread.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExecution {
    public static void main(String args[]){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 10 , 1000);
    }
}
