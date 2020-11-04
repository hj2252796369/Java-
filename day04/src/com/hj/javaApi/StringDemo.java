package com.hj.javaApi;

/**
 * @program: day01
 * @ClassName StirngDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-16 15:15
 **/
public class StringDemo {
    public static void main(String[] args) {
        String url = "https://www.issedu365.com/application/";
        String url1 = "https://www.issedu365.com/login";
        String url2 = "https://www.issedu365.com/index";

        System.out.println(url.startsWith("http://"));
        System.out.println(url.indexOf(3));

        if(url1.indexOf("/login") == -1 || url2.indexOf("/index") == -1){
            System.out.println("请先登录...");
        }else {
            System.out.println("请继续浏览....");
        }
    }
}
