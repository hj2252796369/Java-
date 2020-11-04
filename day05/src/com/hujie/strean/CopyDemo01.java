package com.hujie.strean;

import java.io.*;

/**
 * @program: day05
 * @ClassName CopyDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-19 15:18
 **/
public class CopyDemo01 {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("resource"+File.separator+"sourcePic.jpg");
        File targetFile = new File("resource"+File.separator+"targetPic.jpg");

        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(targetFile);

        System.out.println("复制开始......");
        long start = System.currentTimeMillis();

        byte[] byteAttr = new byte[8192];
        int ch = -1;
        while ((ch = inputStream.read(byteAttr)) != -1){
            outputStream.write(ch);
        }

//        int ch = -1;
//        while ((ch = inputStream.read()) != -1){
//            outputStream.write(ch);
//        }


        long end = System.currentTimeMillis();

        System.out.println("完成复制.... 花费时间为：" + (end-start) );
        outputStream.flush();;

        outputStream.close();
        inputStream.close();;

    }
}
