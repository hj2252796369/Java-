package com.hujie.multithreading;

/**
 * @program: day05
 * @ClassName MyRunnable
 * @description:
 * @author: huJie
 * @create: 2020-10-19 17:11
 **/
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("MyRunnable.... i = " + i);
        }
    }
}
