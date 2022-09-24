package chapter11_MultiThreading.listing8;

public class CurrentThreadDemo0 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();

        System.out.println(t.getName());

        t.setName("MyThread");

        System.out.println(t.getName());

        System.out.println("t = " + t);

        for (int i = 5; i > 0; i--) {
            System.out.println("i = " + i);
            Thread.sleep(1000);
        }
    }
}
