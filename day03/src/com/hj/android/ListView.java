package com.hj.android;

/**
 * @program: day01
 * @ClassName ListView
 * @description:
 * @author: huJie
 * @create: 2020-10-15 11:05
 **/
public class ListView {
    public void setAdapter(AnyAdapter adapter){
        System.out.println("开始适配所有页面和数据");
        for (int i = 0; i < adapter.getCount(); i++) {
            adapter.setView(adapter.getItem(i));
        }

    }
}
