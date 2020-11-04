package com.hujie.file;

import java.io.File;
import java.io.IOException;

/**
 * @program: day01
 * @ClassName FileDemo02
 * @description:
 * @author: huJie
 * @create: 2020-10-19 10:53
 **/
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\SourceCode\\isoftstone\\day05\\resource\\myDemo02.txt");
        if (file.exists()){
            System.out.println("该文件已经存在");
        }else{
            System.out.println("创建新文件");
            file.createNewFile();
        }
        if(file.isFile()){
            System.out.println("file 是一个文件");
        }

        File file2 = new File("D:\\SourceCode\\isoftstone\\day05\\resource");
        if(file2.isDirectory()){
            System.out.println("file2 是一个目录");
        }
    }
}
