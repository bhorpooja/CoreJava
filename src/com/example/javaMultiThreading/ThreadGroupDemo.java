package com.example.javaMultiThreading;

/**
 * Created by pooja on 22/9/17.
 */
class ThreadGroupExample implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroupExample runnable=new ThreadGroupExample();
        ThreadGroup tg=new ThreadGroup("Thread Parent Group");

        Thread t1=new Thread(tg,runnable,"one");
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Thread t2=new Thread(tg,runnable,"two");
        t2.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Thread t3=new Thread(tg,runnable,"three");
        t3.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Group Name : "+tg.getName());
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tg.list();


    }
}
