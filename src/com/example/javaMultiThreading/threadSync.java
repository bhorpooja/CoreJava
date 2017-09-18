package com.example.javaMultiThreading;

/**
 * Created by i net on 11/08/2017.
 */
public class threadSync {
    public static void main(String[] args) {
        Table t1 = new Table();
        thread1 t2 = new thread1(t1);
        thread2 t3=new thread2(t1);
        t2.start();
        t3.start();
    }
}

class Table {
      synchronized void print() {
           for (int i = 1; i <= 5; i++) {
               System.out.println(i);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }
class thread1 extends Thread {
           Table t;

            thread1(Table t) {
                this.t = t;
            }

            public void run() {
                t.print();
            }
        }

class thread2 extends Thread {
    Table t;

    thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.print();
    }
}
