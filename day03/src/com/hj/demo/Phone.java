package com.hj.demo;

public abstract class Phone  extends Computer implements Communication{

    private String name;

    public Phone() {
    }

    public Phone(String name, Cpu cpu, Memory memory, String name1) {
        super(name, cpu, memory);
        this.name = name1;
    }

    @Override
    public void work() {
        super.work();
        I2G();
        I3G();
        I4G();
        I5G();
    }

    @Override
    public void I2G() {
        System.out.println("支持2G");
    }


}
