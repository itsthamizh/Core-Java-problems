package learn.thread.waterremainder;

import javax.swing.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.MINUTES;

public class Application {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        executor.schedule(new WaterRemainder(),1, MINUTES);
    }
}

class WaterRemainder implements Runnable {
    @Override
    public void run() {

        JOptionPane.showMessageDialog(null, "Drink water!", "alert", JOptionPane.ERROR_MESSAGE);
    }
}
