package com.example.javaMultiThreading;

/**
 * Created by pooja on 22/9/17.
 */
class ThreadDaemonExample extends Thread{
    @Override
    public void run() {
        System.out.println("running thread :"+Thread.currentThread().getName());
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread Running....");
        } else {
            System.out.println("Other Thread Running....");
        }
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) {
        ThreadDaemonExample t1=new ThreadDaemonExample();
        ThreadDaemonExample t2=new ThreadDaemonExample();
        ThreadDaemonExample t3=new ThreadDaemonExample();
        t1.setDaemon(true);
        System.out.println("Hey is Thead-0 is Alive :"+t1.isAlive());
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        System.out.println("Hey is Thead-0 is Alive :"+t1.isAlive());
        t3.start();
        System.out.println("Hey is Thread-0 is Alive :"+t1.isAlive());


    }
}
