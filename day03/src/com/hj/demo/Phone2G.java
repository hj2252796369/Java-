package com.hj.demo;

public class Phone2G extends Phone{

    private String name;

    public Phone2G() {
    }

    public Phone2G(String name, Cpu cpu, Memory memory, String name1) {
        super(name, cpu, memory, name1);
    }

    @Override
    public void work() {
        super.work();
    }


    @Override
    public void I3G() {
        System.out.println("不支持3G");
    }

    @Override
    public void I4G() {
        System.out.println("不支持4G");
    }

    @Override
    public void I5G() {
        System.out.println("不支持5G");
    }


}
