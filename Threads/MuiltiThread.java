package Threads;

public class MuiltiThread {

    public static void main(String[] args) throws InterruptedException {
        /*
         * There are 2 ways of creating thread
         * 1. By extending Thread class
         * 2. By implementing Runnable interface
         * 
         * Also if there is a daemon thread running in the background with the other
         * users thread and if the users thread completes its execution before the
         * daemon the JVM will ignore the daemons thread exection and will terminate the JVM
         */

        // 1st Method by extending Thread class
        MyyThread thread1 = new MyyThread();

        // 2nd Method by implementing Runnable interface
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1); // pass the runnable object as an argument to Thread class

        thread1.start();
        // thread1.join(); // this will wait for thread1 to finish its execution before
        // continuing with
        // thread2. Also use join before starting thread2
        thread1.join(4000); // this will wait for 4 seconds before continuing with thread2
        thread2.start();
        System.out.println(1 / 0); // even if theres an error in one thread the other thread will continue

    }

}
