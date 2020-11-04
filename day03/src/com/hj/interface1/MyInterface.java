package com.hj.interface1;

/**
 * @author hujie
 */
public interface MyInterface {

    float PI = 3.14f;

    void print();

    default void work(){
        System.out.println("Default Method");
    }

}
