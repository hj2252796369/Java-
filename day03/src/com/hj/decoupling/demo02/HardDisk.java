package com.hj.decoupling.demo02;

/**
 * @program: day01
 * @ClassName HardDisk
 * @description:
 * @author: huJie
 * @create: 2020-10-15 15:23
 **/
public class HardDisk implements IDisk{
    @Override
    public void save(String file){
        System.out.println("HardDisk 保存文件： " + file );
    }


}
