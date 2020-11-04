package com.hj.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: day01
 * @ClassName ArrayListDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-16 08:56
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String str: list) {
//            System.out.println(str);
//        }

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        list.forEach(s -> {
            System.out.println(s);
        });

    }
}
