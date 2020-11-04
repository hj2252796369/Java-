package com.hj.exception;

/**
 * @program: day01
 * @ClassName MyException
 * @description:
 * @author: huJie
 * @create: 2020-10-16 17:52
 **/
public class MyException extends Exception{
    public MyException() {
        super();
    }
    public MyException(String str) {
        super(str);
    }
}
