package com.hj.zhujie;

/**
 * @program: day01
 * @ClassName Son
 * @description:
 * @author: huJie
 * @create: 2020-10-15 17:00
 **/
public class Son  extends Father{
    @Override
    public void print() {
        super.print();
    }

    @Deprecated
    public void eat(){
        System.out.println("eat。。。。。");
    }

    @SuppressWarnings({"unused"})
    public void warn(){
        int i = 0;
    }
}
