package com.hj.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program: day01
 * @ClassName Test
 * @description:
 * @author: huJie
 * @create: 2020-10-16 17:08
 **/
public class Test {

    public void test(){
        synchronized (this){

        }
    }

    public static void main(String[] args) {


        try {
            ThrowsDemo01.test();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("一直被执行....");
        }


        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        try {
            // 获取年龄
            age = input.nextInt();
            if(age < 0) {
                throw new MyException("您输入的年龄为负数！输入有误！");
            } else if(age > 100) {
                throw new MyException("您输入的年龄大于100！输入有误！");
            } else {
                System.out.println("您的年龄为："+age);
            }
        } catch(InputMismatchException e1) {
            System.out.println("输入的年龄不是数字！");
        } catch(MyException e2) {
            System.out.println(e2.getMessage());
        }

    }
}
