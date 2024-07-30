package Timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleEx {

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("Happy New Year!!!");
                    timer.cancel();
                    System.out.println("Task completed using scheduleAtFixedRate");
                }
            }
        };
        // timer.scheduleAtFixedRate(task, 2000, 1000); // 2sec and 1sec represented in
        // milliseconds
        // you can also use calender on scheduleAtFixedRate
        Calendar date = Calendar.getInstance();
        date.set(2024, 06, 26, 21, 01, 00);
        // the timer will start from 21:01:00 and 1sec interval
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }

}
