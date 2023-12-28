package com.javatechie.lambda.demo.Java8InterviewQ;

import com.javatechie.lambda.demo.EvenAndOddPrinterBy2Threads;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.Callable;


public class EvenOddByusing2Thread implements Runnable {
    Object object;
    static int count=1;

    public EvenOddByusing2Thread(Object objects) {
        this.object = objects;
    }

    @Override
    public void run() {
        while (count < 100) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name:::" + Thread.currentThread().getName() + " count  "+count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {

                    System.out.println("Thread Name:::" + Thread.currentThread().getName() + " count  "+count);
                    count++;


                    object.notify();


                }
            }
        }
    }

     public static void main(String[] args) {


        Object lock= new Object();
        Runnable r1=new EvenOddByusing2Thread(lock);

        Runnable r2=new EvenOddByusing2Thread(lock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();


    }
}
