package chapter11_MultiThreading.listing8;

public class Caller implements Runnable {

    static Object object = new Object();
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }


    }
}
