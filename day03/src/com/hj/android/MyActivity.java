package com.hj.android;

/**
 * @program: day01
 * @ClassName MyActivity
 * @description:
 * @author: huJie
 * @create: 2020-10-15 11:05
 **/
public class MyActivity {
    public static void main(String[] args) {

         String[] myData = {"aaa", "bbb", "ccc"};
         int xml = 100;

        ListView listView = new ListView();
        listView.setAdapter(new AnyAdapter(myData, xml) {
            @Override
            public void convert(String str) {
                System.out.println("当前数据：" + str + " 放入布局中");
            }
        });
    }
}
