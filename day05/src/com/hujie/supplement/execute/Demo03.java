package com.hujie.supplement.execute;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: day05
 * @ClassName Demo03
 * @description:
 *
 *       线程 A B C 各自开始准备，直到三者都准备完毕，然后再同时运行 。也就是要实现一种 线程之间互相等待 的效果
 *
 * CyclicBarrier  线程满足之后执行方法。CycleBarrier barrier =   new CycleBarrier(满足数量， 满足数量之后，调用函数)
 * 		barrier.await();
 * 	复杂操作
 * 		-数据库
 * 		-网络
 * 		-文件
 * 	并发执行
 * 		-线程 - 操作
 * 		-线程 - 操作
 *
 * 限流
 * 	专门的服务类（Guava RateLimiter）
 *
 * @author: huJie
 * @create: 2020-10-20 10:55
 **/
public class Demo03 {
    public static void main(String[] args) {
        runABCWhenAllReady();
    }

    static void runABCWhenAllReady(){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        final Random random = new Random();

        for (char threadName = 'A'; threadName < 'D'; threadName++) {
            final String tN = String.valueOf(threadName);
            new Thread(()->{

                int prepareTime = random.nextInt(5000) + 1000;

                System.out.println("线程 " + tN  + "  准备时间为：" + prepareTime);
                try {
                    Thread.sleep(prepareTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程 " + tN + " 准备完成... 等待其他线程准备完成");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

                System.out.println("线程 " +  tN +" 开始运行...");

            }).start();
        }
    }
}
