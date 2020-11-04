package com.hj;

/**
 * @program: day01
 * @ClassName Demo01
 * @description:
 * @author: huJie
 * @create: 2020-10-16 11:29
 **/
public class Demo01 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.run();
        Demo01 demo011 = new Demo01();
        demo011.run();
        System.out.println(Thread.currentThread().getName());
    }

    public String case2(int index, String string, int max) {
        String returnString = null;
        if (index < 0) {
            throw new IndexOutOfBoundsException("exception <0 ");
        }


        if (index == 1) {
            if (string.length() < 2) {
                if (max > 0) {
                    return string;
                } else {
                    return "string";
                }
            }
            returnString = "returnString1";
        } else if (index == 2) {
            if (string.length() < 5) {
                return string;
            }
            returnString = "returnString2";
        } else {
            throw new IndexOutOfBoundsException("exception >2 ");
        }

        return returnString;
    }

}
