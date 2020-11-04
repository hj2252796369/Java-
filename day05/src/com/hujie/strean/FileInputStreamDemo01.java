package com.hujie.strean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: day05
 * @ClassName FileInputStreamDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-19 14:37
 **/
public class FileInputStreamDemo01 {

    public static void main(String[] args) {

        String str = "";
        File file = new File("resource"+File.separator+"demo.txt");
        try {
            if (file.canRead()) {
                System.out.println("文件可读");
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            int read;
            while ((read = fileInputStream.read()) != -1) {
                char ch = (char) read;
                str += ch;

            }
            //中文是两个字节，这里是每次读取一个字节，所以出现中文乱码的情况。
            System.out.println("文件内容： " + str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
