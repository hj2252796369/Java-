package com.other;

import java.io.IOException;

/**
 * @program: day06
 * @ClassName Test
 * @description:
 *          Cmd 清屏处理
 * @author: huJie
 * @create: 2020-10-22 09:11
 **/
public class ClsUtil {
    public static void cls() throws IOException, InterruptedException {

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
}
