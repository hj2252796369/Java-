package com.hj.map;

import java.util.Map;

/**
 * @program: day01
 * @ClassName HashMap
 * @description:
 * @author: huJie
 * @create: 2020-10-16 11:33
 **/
public class HashTable {
    public static void main(String[] args) {
        Map<Integer, String> hashTable = new java.util.Hashtable<>();
        hashTable.put(1, "aaa");
        hashTable.put(2, "aaa");
        hashTable.put(3, "ccc");

        for (Map.Entry<Integer, String> entity: hashTable.entrySet()) {
            System.out.println("key = " + entity.getKey() + "  value = " + entity.getValue());
        }

        for (Integer key: hashTable.keySet()) {
            System.out.println("key = " + key + " value = " + hashTable.get(key));
        }

        for (String value : hashTable.values()
             ) {
            System.out.println("value = " + value);
        }



    }
}
