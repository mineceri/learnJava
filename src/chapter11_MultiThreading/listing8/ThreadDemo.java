package chapter11_MultiThreading.listing8;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 5; i > 0; i--) {
                System.out.println("child i = " + i);
                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 5; i > 0; i--) {
            System.out.println("main i = " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
