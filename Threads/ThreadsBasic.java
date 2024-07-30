package Threads;

/*
 * Thread- A thread is  a flow of execution within a program.
 * A thread of execution in a program(kind of like a virtual CPU)
 * The JVM allows an application to have multiple threads of execution.(running at the same time)
 * Each thread can exceute parts of the code in parallel with the main thread
 * Each thread has a priority
 * the Thread with the highest priority is executed first then those with lower priority
 * 
 * With Java Virtual Machine continues to execute thread until either of the following occurs:-
 * 1. The exit method of the class runtime is called
 * 2. All the users thread have been terminated(died)
 * 
 * When the JVM starts up there is a thread that calls the main method.This Thread is called "main"
 * 
 * A Daemon thread is a thread that runs in the background.
 *  a daemon thread is a low priority thread that runs in the background to perform such as garbage collection
 *  JVM terminates itself when all users threads (non - daemon) finish their execution
 */

public class ThreadsBasic {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount()); // gives the number of threads that are currently active
        System.out.println(Thread.currentThread().getName()); // gives the name of the current thread
        Thread.currentThread().setName("Gautam's Thread"); // changes the name of the current thread
        System.out.println(Thread.currentThread().getName());

        // priority are in the scale between 1 to 10. 10 is the highest and 1 is the
        // lowest
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        // for(int counter=5;counter>0;counter--){
        // Thread.sleep(1000); // pauses the thread for 1 second
        // System.out.println(counter);
        // Thread.sleep(1500); // also requires to handle exception
        // }
        // System.out.println("Thread sleep working");
        System.out.println();

        MyThread thread2 = new MyThread(); // creating an object of MyThread class
        thread2.start(); // starting the thread
        System.out.println(thread2.isAlive()); // checking if the thread is alive or not
        System.out.println(thread2.getName());
        thread2.setName("MyThread2");
        System.out.println(thread2.getName());
        System.out.println(thread2.getPriority()); // this priority is inherited from the main thread
        System.out.println(Thread.activeCount());

        System.out.println();
        MyThread thread3 = new MyThread();
        System.out.println(thread3.isDaemon());
        // thread3.setDaemon(true);
        System.out.println(thread3.isDaemon());
        thread3.start();
    }
}
