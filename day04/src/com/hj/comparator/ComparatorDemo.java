package com.hj.comparator;

import javax.annotation.processing.Completion;
import java.util.*;

/**
 * @program: day01
 * @ClassName CmparatorDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-16 12:27
 **/
public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");


        list.add("ddd");
        list.add("ccc");
        list.add("bbb");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });



        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String str : list
        ) {
            System.out.println(str);
        }

    }


}
