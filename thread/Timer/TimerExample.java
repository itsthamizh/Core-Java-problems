package learn.thread.Timer;

import java.util.Timer;
import java.util.TimerTask;

class FirstClass extends TimerTask{
    public void run(){
        System.out.println("This is for print statement inside of run method");
        System.out.println("its end of exit");
    }
}

public class TimerExample {
    public static void main(String args[]){
        FirstClass thread = new FirstClass();

        Timer timer = new Timer();
        timer.schedule(thread,2000,1000);
        try {
            Thread.sleep(1000);
        }
        catch(Exception e){

        }

      //  timer.cancel();
    }
}
