package com.hujie.strean;

import com.sun.deploy.util.SystemUtils;
import sun.plugin2.util.SystemUtil;

import java.io.*;

/**
 * @program: day05
 * @ClassName FileInputStreamDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-19 14:37
 **/
public class FileOutStreamDemo01 {

    public static void main(String[] args) throws IOException {

        String str = "";
        File file = new File("resource"+File.separator+"myDemo02.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);

            fileOutputStream.write("FileOutStreamDemo01".getBytes());
            System.out.println("完成...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.flush();;
            fileOutputStream.close();
        }


    }


}
