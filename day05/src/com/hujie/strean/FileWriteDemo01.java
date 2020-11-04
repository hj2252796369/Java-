package com.hujie.strean;

import java.io.*;

/**
 * @program: day05
 * @ClassName FileReaderDemo01
 * @description:
 * @author: huJie
 * @create: 2020-10-19 15:07
 **/
public class FileWriteDemo01 {
    public static void main(String[] args) {
        String str = "";
        File file = new File("resource"+File.separator+"demo.txt");
        try {
            //true  表示追加内容
            Writer fileWriter = new FileWriter(file, true);

            fileWriter.write("4444444444");
            fileWriter.flush();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
