package com.hujie.supplement.execute;

import java.util.concurrent.CountDownLatch;

/**
 * @program: day05
 * @ClassName Demo02
 * @description:
 *  四个线程 A B C D，其中 D 要等到 A B C 全执行完毕后才执行，而且 A B C 是同步运行的
 *       使用CountdownLatch 实现这类的通讯
 *          1、创建一个计数器，设置初始值，CountdownLatch  countDownLatch = new CountdownLatch(2);
 *          2、在 等待线程 里调用countDownLatch.await() 方法，进入等待状态，知道计数值变成0
 *          3、在 其他线程 里，调用countDownLatch.countDown()（原子性方法）方法，该方法会将计数值减少1；
 *          4、当 其他线程的countDown() 方法把计数器变成0时，等待线程里的countDownLatch。await()立马退出，继续执行代码
 *
 *
 *         CountDownLatch 适用于一个线程去等待多个线程的情况。
 *
 *
 * @author: huJie
 * @create: 2020-10-20 10:41
 **/
public class Demo02 {

    public static void main(String[] args) {
        runDAfterABC();
    }


    static void runDAfterABC(){
        int workerNum = 3;
        CountDownLatch countDownLatch = new CountDownLatch(workerNum);

        new Thread(()->{
            System.out.println("D线程等待其他线程运行完成后执行");
            try {
                countDownLatch.await();
                System.out.println("其他线程运行完成，D线程开始运行...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        for (char threadName = 'A'; threadName < 'D'; threadName++) {
            final String tN = String.valueOf(threadName);
            new Thread(()->{
                System.out.println("线程 " + tN  + "  开始工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程 " + tN + " 运行完成..");
                countDownLatch.countDown();
            }).start();
        }

    }
}
