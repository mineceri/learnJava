package chapter11_MultiThreading.listing8;

public class NewThread4 implements Runnable {
    String name; // name of thread
    Thread t;

    NewThread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                if (name.equals("One")) {
                    Thread.sleep(10000);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}