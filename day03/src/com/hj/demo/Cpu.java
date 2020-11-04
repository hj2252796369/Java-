package com.hj.demo;

/**
 * @program: day01
 * @ClassName Cpu
 * @description:
 * @author: huJie
 * @create: 2020-10-15 14:39
 **/
public class Cpu {
    private String  name;
    public void work(){
        System.out.println(this.name + " CPU 开始工作");
    }

    public Cpu() {
    }

    public Cpu(String name) {
        this.name = name;
    }
}
