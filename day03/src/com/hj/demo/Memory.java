package com.hj.demo;

/**
 * @program: day01
 * @ClassName Memory
 * @description:
 * @author: huJie
 * @create: 2020-10-15 14:39
 **/
public class Memory {
    private String  name;
    public void work(){
        System.out.println(this.name + " Memory 开始工作");
    }

    public Memory() {
    }

    public Memory(String name) {
        this.name = name;
    }
}
