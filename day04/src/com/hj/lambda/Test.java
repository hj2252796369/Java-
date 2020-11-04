package com.hj.lambda;

/**
 * @program: day01
 * @ClassName Test
 * @description:
 * @author: huJie
 * @create: 2020-10-16 14:12
 **/
public class Test {
    public static void main(String[] args) {
        MyFunctionInterface myFunctionInterface = new MyFunctionInterface() {
            @Override
            public void print(String name, String password) {
                System.out.println("Print.....");
                System.out.println("name = " + name + "  password=" + password);
            }
        };

        MyFunctionInterface myFunctionInterface1 = (x, y) -> {
            System.out.println("Print Lambda.....");
            System.out.println("name = " + x + "  password=" + y);
        };

        myFunctionInterface.print("admin", "123");
        myFunctionInterface1.print("admin", "123");;


    }

}
