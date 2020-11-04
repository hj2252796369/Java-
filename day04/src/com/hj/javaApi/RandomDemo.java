package com.hj.javaApi;

import java.util.Random;

/**
 * @program: day01
 * @ClassName RandomDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-16 15:09
 **/
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }

}
