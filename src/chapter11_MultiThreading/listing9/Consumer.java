package chapter11_MultiThreading.listing9;

public class Consumer implements Runnable{
    Queue queue;
    Thread t;

    public Consumer(Queue queue) {
        this.queue = queue;
        this.t = new Thread(this,"Consumer");
    }

    @Override
    public void run() {
        while (true){
            queue.get();
        }
    }
}
