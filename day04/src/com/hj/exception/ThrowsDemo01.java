package com.hj.exception;

/**
 * @program: day01
 * @ClassName ThrowsDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-16 17:07
 **/
public class ThrowsDemo01 {

    public static void test () throws ClassNotFoundException {
        Class.forName("com.hj.aaa");
    }

}
