package Timer;

import java.util.Timer;
import java.util.TimerTask;

public class BasicEx {

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {  // run() is an abstract method in TimerTask class

            @Override
            public void run() {
                System.out.println("Task completed");
                timer.cancel();
            }
        };

        timer.schedule(task, 2000);  // it will run after 2 seconds
    }

}
