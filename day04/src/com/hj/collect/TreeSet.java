package com.hj.collect;

import java.util.Set;

/**
 * @program: day01
 * @ClassName HashSet
 * @description:
 * @author: huJie
 * @create: 2020-10-16 11:00
 **/
public class TreeSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.TreeSet<>();
        set.add("aaaa");
        set.add("ffff");
        set.add("dddd");

        for (String str: set) {
            System.out.println(str);
        }

    }

}
