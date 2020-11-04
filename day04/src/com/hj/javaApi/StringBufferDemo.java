package com.hj.javaApi;

/**
 * @program: day01
 * @ClassName StringBufferDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-16 14:43
 **/
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append("123").append(123).append(true));

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("123").append(123).append(true));
    }
}
