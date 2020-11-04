package com.hujie.supplement.execute;

/**
 * @program: day05
 * @ClassName ExecuteOnce
 * @description:  让两个线程依次执行。
 * @author: huJie
 * @create: 2020-10-20 10:23
 **/
public class ExecuteOnce {
    public static void main(String[] args) {


//        demo01();;
//        demo02();
        demo03();
    }

    static void printNumber(String threadName){
        int i = 0;
        while (i++ < 3){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " i = "  + i);
        }
    }
    static  void demo01(){
        Thread A = new Thread(()->{
            printNumber("A");
        });

        Thread B = new Thread(()->{
            printNumber("B");
        });

        A.start();
        B.start();
    }

    /**
     *  如果让B在A执行完成之后再执行，添加thread.join 方法
     *

     */
    static  void demo02(){
        Thread A = new Thread(()->{
            printNumber("A");
        });

        Thread B = new Thread(()->{
            System.out.println("B  等待A 执行完成再执行");
            try {
                A.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printNumber("B");
        });


        A.start();
        B.start();
    }

    /**
     *  让连个线程按照指定的方式游戏交叉运行： 可以使用object.wait()  和  object.notify() A 1  B 123  A 23
     *
     *    *  创建一个A和B共享锁lock
     *      *  当A得到锁后，先打印1 然后调用lock。wait(),交出锁的权限进入wait状态
     *      *  对B来说 A最开始得到了锁，导致B无法继续执行，当Await（）时，释放控制前，B才得到了锁
     *      *
     *      *  B得到锁之后打印1,2,3 然后调用lock。notify，唤醒睡眠的A，A继续打印剩下的2,3
     *      *
     */
    static  void demo03(){
        //让连个线程按照指定的方式游戏交叉运行： 可以使用object.wait()  和  object.notify()

        Object lock = new Object();

        Thread A = new Thread(()->{
            synchronized (lock){
                System.out.println("A  1");

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("A  2");
                System.out.println("A  3");
            }

        });


        Thread B = new Thread(()->{
            synchronized (lock){
                System.out.println("B 1");
                System.out.println("B 2");
                System.out.println("B 3");
                lock.notify();
            }

        });

        //让连个线程按照指定的方式游戏交叉运行： 可以使用object.wait()  和  object.notify()

        A.start();
        B.start();
    }

}
