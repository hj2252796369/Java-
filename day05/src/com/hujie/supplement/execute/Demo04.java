package com.hujie.supplement.execute;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: day05
 * @ClassName Demo04
 * @description:
 *      将子线程的结果返回。
 *      在 Java 里，有一个类是配合 Callable 使用的：FutureTask，不过注意，它获取结果的 get 方法会阻塞主线程。
 *
 *        Callable也是一个接口，就只有一个call方法，  call方法编写需要执行的代码，返回的就是执行的结果。和Runnable差别是他有返回的结果，并且可以跑出异常。一般配合ThreadPoolExecutor使用
 *          Future  可以对具体Runnable或者Callable任务进行取消、判断任务是否已取消、查询任务是否完成、获取任务结果。get()方法都会阻塞当前调用get的线程，知道返回结果或者超时才会唤醒
 *           FutureTask不是接口了，是个class。它实现了RunnableFuture接口 public class FutureTask<V> implements RunnableFuture<V> 而RunnableFuture接口又继承了Runnable和Future public interface RunnableFuture<V> extends Runnable, Future<V> 因此它可以作为Runnable被线程执行，又可以有Future的那些操作。
 * @author: huJie
 * @create: 2020-10-20 11:13
 **/
public class Demo04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        doTaskWithResultInWorker();
    }

    static void  doTaskWithResultInWorker() throws ExecutionException, InterruptedException {

        Callable<Integer> callable = new Callable() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Task  开始工作");
                Thread.sleep(1000);

                int result = 0;
                for (int i = 0; i <= 100; i++) {
                    result += i;
                }

                System.out.println("Task  完成工作");
                return result;
            }
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();

        System.out.println("开始获取结果之前。。。。" );
        System.out.println("结果为：" + futureTask.get());
        System.out.println("结果获取完成..");
    }

}
