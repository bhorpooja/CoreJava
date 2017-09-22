package com.example.javaMultiThreading;

/**
 * Created by pooja on 22/9/17.
 */
class currentThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Running thread name is : "+Thread.currentThread().getName());
        System.out.println("Running thread priority is : "+Thread.currentThread().getPriority());
//        try {
//            Thread.sleep(100,100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        currentThreadDemo c1=new currentThreadDemo();
        currentThreadDemo c2=new currentThreadDemo();

        System.out.println("current thread name is : "+Thread.currentThread().getName());
        System.out.println("current thread priority is : "+Thread.currentThread().getPriority());

//        c1.setPriority(10);
//        c2.setPriority(1);

        c1.setPriority(Thread.MIN_PRIORITY);
        c2.setPriority(Thread.MAX_PRIORITY);

        c1.start();
        c2.start();
    }
}
