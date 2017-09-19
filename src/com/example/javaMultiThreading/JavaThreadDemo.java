package com.example.javaMultiThreading;

/**
 * Created by i net on 11/08/2017.
 */
class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class JavaThreadDemo {

    public static void main(String[] args) {
        //using Thread class
//      ThreadDemo t1=new ThreadDemo();
//        ThreadDemo t2=new ThreadDemo();
//        t1.start();
////        try {
////            j.join();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        t2.start();

        //using runnable interface
       RunnableDemo r1=new RunnableDemo();
       RunnableDemo r2=new RunnableDemo();
        Thread t=new Thread(r1);
        Thread tt=new Thread(r2);
        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        tt.start();
//        try {
//            tt.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Multithreading Demo");

    }


}
