package chapter11_MultiThreading.listing10;

public class A {

    synchronized void first(B b){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b.last();
    }
    synchronized void last(){
        System.out.println("A last");
    }
}
