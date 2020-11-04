package com.hj.demo;

/**
 * @program: day01
 * @ClassName Computer
 * @description:
 * @author: huJie
 * @create: 2020-10-15 14:42
 **/
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private String name;

    public Computer() {
    }

    public Computer(String name, Cpu cpu, Memory memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public void work(){
        cpu.work();
        memory.work();
        System.out.println(this.name + " 电脑 开始运行");
    }
}
