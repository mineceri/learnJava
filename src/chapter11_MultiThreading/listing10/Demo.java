package chapter11_MultiThreading.listing10;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread thread1=new Thread(() -> a.first(b));
        Thread thread2=new Thread(() -> b.first(a));
        thread1.start();
        thread2.start();
    }
}
