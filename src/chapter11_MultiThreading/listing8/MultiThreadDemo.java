package chapter11_MultiThreading.listing8;


public class MultiThreadDemo {
    public static void main(String args[]) {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        // Start the threads.
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
