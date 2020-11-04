package com.hj.generics;

/**
 * @program: day01
 * @ClassName Result
 * @description:
 * @author: huJie
 * @create: 2020-10-15 16:03
 **/

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
