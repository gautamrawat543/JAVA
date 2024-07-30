package Threads;

public class MyRunnable implements Runnable {
    // by implementing runnable interface we can see the error to import its abstract
    // method run() which is helpful.

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Thread #2 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is over");

    }

}
