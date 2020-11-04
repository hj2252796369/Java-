package com.hujie.strean;

import java.io.*;

/**
 * @program: day05
 * @ClassName BufferStreamDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-19 16:01
 **/
public class BufferStreamDemo01 {

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("resource"+File.separator+"sourcePic.jpg");
        File targetFile = new File("resource"+File.separator+"targetPic.jpg");

        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(targetFile);

        BufferedInputStream bis = new BufferedInputStream(inputStream);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);

        System.out.println("复制开始......");
        long start = System.currentTimeMillis();

        int ch = -1;

        while ((ch = bis.read()) != -1){
            bos.write(ch);
        }


        long end = System.currentTimeMillis();

        System.out.println("完成复制.... 花费时间为：" + (end-start) );


        bis.close();
        bos.flush();
        bos.close();;

        outputStream.flush();;
        outputStream.close();
        inputStream.close();;



    }

}
