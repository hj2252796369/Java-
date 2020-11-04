package com.hj.demo;

/**
 * @program: day01
 * @ClassName UI
 * @description:
 * @author: huJie
 * @create: 2020-10-14 11:21
 **/
public class UI {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "zhangsan ";   使用public时，可直接调用
        student.setId("111");


        System.out.println("name= " + student.getName() + " id = " + student.getId());
    }

}
