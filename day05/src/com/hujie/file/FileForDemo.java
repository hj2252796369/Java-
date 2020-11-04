package com.hujie.file;

import java.io.File;

/**
 * @program: day01
 * @ClassName FileDemo03
 * @description:
 * @author: huJie
 * @create: 2020-10-19 11:13
 **/
public class FileForDemo {
    public static void main(String[] args) {
        File file = new File("resource");
        if(file.isDirectory()){
            String[] stringAttr = file.list();
            for (String str: stringAttr) {
                System.out.println(str);
            }

            File[] files = file.listFiles();
            for (File fileOne:files) {
                System.out.println(fileOne);
            }
        }
    }
}
