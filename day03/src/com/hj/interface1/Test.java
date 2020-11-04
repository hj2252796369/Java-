package com.hj.interface1;

/**
 * @program: day01
 * @ClassName Test
 * @description:
 * @author: huJie
 * @create: 2020-10-15 12:08
 **/
public class Test {
    public static void main(String[] args) {
//        MyInterface.PI = 8.8;
        System.out.println(MyInterface.PI);
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.print();

        myInterface.work();;
    }
}
