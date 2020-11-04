package com.hujie.rukou;

/**
 * @program: day05
 * @ClassName HelloWorld
 * @description:
 * @author: huJie
 * @create: 2020-10-20 13:51
 **/
public class HelloWorld {
    public static void main(String[] args) {
        //获取程序入口参数
        if(args.length > 0 && args != null){
            System.out.println("程序运行正常, args 参数：" );
            for (String str: args) {
                System.out.println(str);
            }
        }else{
            System.out.println("程序运行正常， 无args参数");
        }
    }
}
