package com.hj.demo;

/**
 * @program: day01
 * @ClassName Test
 * @description:
 * @author: huJie
 * @create: 2020-10-15 14:44
 **/
public class Test {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Inter");
        Memory memory = new Memory("jinshidun");

        Computer computer = new Computer("ASUS", cpu, memory);
        computer.work();

        Phone phone = new Phone3G("realme", cpu, memory, "realme Q");
        phone.work();;
    }

}
