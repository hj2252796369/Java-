package com.hujie.demo;

/**
 * @program: day05
 * @ClassName TicketWindow
 * @description:
 * @author: huJie
 * @create: 2020-10-20 08:53
 **/
public class TicketWindow implements Runnable{

    volatile int ticketNum = 100;
    @Override
    public void run() {
        while (true){

//            //同步代码
//            synchronized (MyLock.lock){
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                if(ticketNum > 0){
//                    System.out.println("当前窗口为： " +  Thread.currentThread().getName() +"   开始售票...剩余票数： " + ticketNum--);
//                }
//            }
            sell();
        }
    }


    public synchronized void sell(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(ticketNum > 0){
            System.out.println("当前窗口为： " +  Thread.currentThread().getName() +"   开始售票...剩余票数： " + ticketNum--);
        }
    }
}
