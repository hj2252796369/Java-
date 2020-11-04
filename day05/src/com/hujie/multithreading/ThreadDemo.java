package com.hujie.multithreading;

/**
 * @program: day05
 * @ClassName ThreadDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-19 16:44
 **/
public class ThreadDemo {
    public static void main(String[] args) {
//        Thread thread1 = new MyThread();
//        Thread thread2 = new MyThread();

        Thread thread1 = new MyThread01("thread1");
        Thread thread2 = new MyThread01("thread2");
        //
//        thread1.start();
//        thread2.start();

        thread1.run();

        System.out.println(Thread.currentThread().getName());
    }

}
