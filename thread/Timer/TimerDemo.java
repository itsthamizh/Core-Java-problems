package learn.thread.Timer;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main (String args[]){

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                System.out.println("Alarm going to off..!");
                System.exit(0);
            }
        };

        TimerTask secondTask = new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "Alarm going to off..!", "alert", JOptionPane.ERROR_MESSAGE);
            }
        };

        Timer secondTimer = new Timer();
        secondTimer.schedule(secondTask,2000);
        Timer timer = new Timer();
        timer.schedule(timerTask,2000);

    }
}
