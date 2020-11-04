package com.hujie.file;

import java.io.File;

/**
 * @program: day05
 * @ClassName FilePathRecursiveDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-19 14:03
 **/
public class FilePathRecursiveDemo {
    public static void main(String[] args) {
        File file = new File("D:\\SourceCode\\isoftstone");
        findAllFiles(file);
    }

    static void findAllFiles(File file){
        File[] files = file.listFiles();
        for (File f: files) {
            if(f.isDirectory()){
                findAllFiles(f);
            }
            if(f.isFile()){
                System.out.println(f.getPath());
            }
        }
    }
}
