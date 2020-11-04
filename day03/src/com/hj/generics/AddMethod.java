package com.hj.generics;

/**
 * @program: day01
 * @ClassName AddMethod
 * @description:
 * @author: huJie
 * @create: 2020-10-15 16:19
 **/
public class AddMethod {
    public static <T extends Number> int add(T a, T b){
        return a.intValue()+b.intValue();
    }
}
