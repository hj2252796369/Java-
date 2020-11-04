package com.hujie.file;

import java.io.File;

/**
 * @program: day01
 * @ClassName FilePathDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-19 11:22
 **/
public class FilePathDemo {
    public static void main(String[] args) {
        //Java 项目相对路径  一般都是从工程下开始的  这里和Web工程不同
        File file = new File("resource/demo.txt");

        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

    }
}
