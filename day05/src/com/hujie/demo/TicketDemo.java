package com.hujie.demo;

/**
 * @program: day05
 * @ClassName TicketDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-20 09:05
 **/
public class TicketDemo {
    public static void main(String[] args) {

        TicketWindow ticketWindow = new TicketWindow();

        Thread thread1 = new Thread(ticketWindow, "窗口一");
        Thread thread2 = new Thread(ticketWindow, "窗口二");
        Thread thread3 = new Thread(ticketWindow, "窗口三");


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
