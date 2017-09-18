package com.example.javaMultiThreading;

/**
 * Created by i net on 11/08/2017.
 */
public class javaThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        javaThread j=new javaThread();
        j.start();
        try {
            j.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         javaThread j1=new javaThread();
        j1.start();
    }


}
