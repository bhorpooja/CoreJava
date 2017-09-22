package com.example.javaMultiThreading;

/**
 * Created by pooja on 22/9/17.
 */
class ThreadSuspendExample implements Runnable{
    @Override
    public void run() {
        if (Thread.currentThread().isAlive()) {
            System.out.println("Current Thread running : " + Thread.currentThread().getName());
            System.out.println("Thread State : " + Thread.currentThread().getState());
        }
        else {
            System.out.println("no thread is running");
        }
    }
}
public class ThreadSuspendDemo {
    public static void main(String[] args) {
        ThreadSuspendExample t=new ThreadSuspendExample();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);

        t1.suspend();
        System.out.println("Thread-0 State : "+t1.getState());
        t1.start();
        t2.start();
        System.out.println("Thread-1 State : "+t2.getState());
        t2.interrupt();
        System.out.println("is thread interrupted : "+t2.isInterrupted());
        t2.yield();
        // System.out.println("Thread isInterrupted : "+t1.isInterrupted());
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t3.start();
        t3.stop();
        t1.resume();


    }
}
