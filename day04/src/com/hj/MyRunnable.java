package com.hj;

/**
 * @program: day01
 * @ClassName thread
 * @description:
 * @author: huJie
 * @create: 2020-10-16 11:12
 **/
public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("111111111111");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();;
//        myRunnable.run();
//        String name = Thread.currentThread().getName();
//        System.out.println(name);
    }
}
