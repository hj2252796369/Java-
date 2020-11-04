package com.hujie.multithreading;

/**
 * @program: day05
 * @ClassName MyThread
 * @description:
 * @author: huJie
 * @create: 2020-10-19 16:43
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

    }
}
