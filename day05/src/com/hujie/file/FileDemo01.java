package com.hujie.file;

import java.io.File;

/**
 * @program: day01
 * @ClassName FileDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-19 10:53
 **/
public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("D:\\SourceCode\\isoftstone\\day05\\resource\\demo.txt");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getPath());

        File file1 = new File("resource\\demo.txt");
        System.out.println("file1.........");
        System.out.println(file1);
        System.out.println(file1.length());

    }
}
