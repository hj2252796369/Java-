package com.hj.android;

/**
 * @program: day01
 * @ClassName AnyAdapter
 * @description:
 * @author: huJie
 * @create: 2020-10-15 11:05
 **/
public abstract class AnyAdapter {
    private String[] myData;
    private int xml;

    public AnyAdapter(String[] myData, int xml) {
        this.myData = myData;
        this.xml = xml;
    }

    public int getCount() {
        return (myData == null) ? 0 : myData.length;
    }

    public String getItem(int position){
        return myData[position];
    }

    public void setView(String str){
        System.out.println("开始加载每一行");
        convert(str);
        System.out.println("当前行和数据加载完毕");
    }

    public abstract void convert(String str);

}
