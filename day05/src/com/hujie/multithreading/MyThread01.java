package com.hujie.multithreading;

/**
 * @program: day05
 * @ClassName MyThread
 * @description:
 * @author: huJie
 * @create: 2020-10-19 16:43
 **/
public class MyThread01 extends Thread{
    public MyThread01() {
    }

    public MyThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

    }
}
