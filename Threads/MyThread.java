package Threads;

public class MyThread extends Thread { // Thread class is inherited 

    @Override
    public void run() { // run() method is a method in Thread class we are overriding it
        if(this.isDaemon()) {
            System.out.println("Thread  daemon is running");
        }else{

            System.out.println("Thread user is running");
        }
    }

    
    
}
