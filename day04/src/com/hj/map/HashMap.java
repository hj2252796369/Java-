package com.hj.map;

import java.util.Map;
import java.util.Set;

/**
 * @program: day01
 * @ClassName HashMap
 * @description:
 * @author: huJie
 * @create: 2020-10-16 11:33
 **/
public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1, "aaa");
        hashMap.put(2, "bbb");
        hashMap.put(3, "ccc");

        for (Map.Entry<Integer, String> entity: hashMap.entrySet()) {
            System.out.println("key = " + entity.getKey() + "  value = " + entity.getValue());
        }

        for (Integer key: hashMap.keySet()) {
            System.out.println("key = " + key + " value = " + hashMap.get(key));
        }

        for (String value : hashMap.values()
             ) {
            System.out.println("value = " + value);
        }



    }
}
