package com.hj.decoupling.demo02;

/**
 * @program: day01
 * @ClassName UDisk
 * @description:
 * @author: huJie
 * @create: 2020-10-15 15:22
 **/
public class UDisk implements IDisk{
    @Override
    public void save(String file){
        System.out.println("UDisk 保存文件： " + file );
    }
}
