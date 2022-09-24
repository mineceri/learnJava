package chapter11_MultiThreading.listing10;

public class B {

    synchronized void first(A a){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        a.last();
    }
    synchronized void last(){
        System.out.println("B last");
    }
}
