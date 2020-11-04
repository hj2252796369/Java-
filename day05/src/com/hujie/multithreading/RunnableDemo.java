package com.hujie.multithreading;

/**
 * @program: day05
 * @ClassName RunnableDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-19 17:12
 **/
public class RunnableDemo {
    public static void main(String[] args) {
//       MyRunnable myRunnable = new MyRunnable();
//       Thread thread2 = new Thread(myRunnable);
//       Thread thread1 = new Thread(myRunnable);
//
//       thread2.start();
//       thread1.start();


        //匿名对象、匿名内部类  不复用时可以这么写
        new Thread(()->{
            for (int i = 0; i < 100 ; i++) {
                System.out.println("i = " + i);
            }

        }).start();

    }
}
