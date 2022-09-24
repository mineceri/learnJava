package chapter11_MultiThreading.listing9;

public class Producer implements Runnable {
    Queue queue;
    Thread t;

    public Producer(Queue queue) {
        this.queue = queue;
        this.t = new Thread(this,"Producer");
    }

    @Override
    public void run() {
        int o=0;
        while (true){
            queue.put(o++);
        }
    }
}
