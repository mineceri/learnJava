package chapter11_MultiThreading.listing9;

public class Queue {
    int n;
    boolean valueSet=false;


   synchronized public int get(){
       try {
           while (!valueSet) {
               wait();
           }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
        System.out.println("Got: " + n);
       valueSet=false;
       notify();
       return n;
    }
   synchronized public void put(int n){
       try {
           while (valueSet) {
               wait();
           }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       this.n=n;
       valueSet=true;
        System.out.println("Put: " + n);
        notify();
    }
}
