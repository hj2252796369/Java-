package com.hj.lambda;

/**
 * @program: day01
 * @ClassName MyFunctionInterface
 * @description:
 * @author: huJie
 * @create: 2020-10-16 14:10
 **/
@FunctionalInterface
public interface MyFunctionInterface {

    void print(String name, String password);

    default void work(){

    };

}
