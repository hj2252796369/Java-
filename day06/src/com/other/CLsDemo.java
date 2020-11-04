package com.other;

import java.io.IOException;
import java.util.Scanner;

/**
 * @program: day06
 * @ClassName CLsDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-22 09:25
 **/
public class CLsDemo {
    public static void main(String[] args) {
        try {
            System.out.println("==================");
            System.out.println("请输入。。。。。。。");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println("1s后开始清除..........");
            Thread.sleep(1000);
            ClsUtil.cls();
            System.out.println("清除完成..........");
            System.out.println("进行其他操作..........");
            System.out.println("睡10s结束..........");
            Thread.sleep(10000);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
