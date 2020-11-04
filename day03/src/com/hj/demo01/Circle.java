package com.hj.demo01;

import java.sql.SQLOutput;

/**
 * @program: day01
 * @ClassName Circle
 * @description:
 * @author: huJie
 * @create: 2020-10-15 15:31
 **/
public class Circle {

    private double redius = 0;

    public Circle() {
    }

    public Circle(double redius) {
        this.redius = redius;
    }

    /**
     *  内部类
     */
    class Draw{
        private double redius = 0;
        public void drawShape(){
            System.out.println("drawShape");
            redius = 8; //调用Draw类的redius属性
            Circle.this.redius = 9; //调用外部类属性
        }
    }
}
