package chapter11_MultiThreading.listing9;

public class PC {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);
        consumer.t.start();
        producer.t.start();

    }
}
