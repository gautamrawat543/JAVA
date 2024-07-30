package Timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class CalenderEx {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task completed using calender ");
                timer.cancel();
            }
        };
        Calendar date = Calendar.getInstance();
        // Month starts from 0=january, hourofday 0=12am and 12=12pm
        date.set(2024, 06, 26, 20, 50, 0);
        timer.schedule(task, date.getTime());

    }

}
