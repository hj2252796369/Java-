package com.hj.demo01.service;

import com.hj.demo01.module.User;

/**
 * @program: day01
 * @ClassName LoginService
 * @description:
 * @author: huJie
 * @create: 2020-10-14 14:26
 **/
public class UserService {

    public boolean login(String username, String password){

        //常量字符串放前面进行比较，可以防止比较值因空字符串二报错。
        if("admin".equals(username) && "123456".equals(password)){
            return true;
        }
        return false;
    }

    public boolean login(User user){
        if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            return true;
        }
        return false;
    }

    public boolean register(User user){
        System.out.println("用户名：" + user.getUsername() + "  密码：" + user.getPassword());
        return true;
    }

}
