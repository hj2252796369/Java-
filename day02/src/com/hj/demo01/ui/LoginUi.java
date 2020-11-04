package com.hj.demo01.ui;

import com.hj.demo01.module.User;
import com.hj.demo01.service.UserService;

import java.util.Scanner;

/**
 * @program: day01
 * @ClassName LoginUI
 * @description:
 * @author: huJie
 * @create: 2020-10-14 14:26
 **/
public class LoginUi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入用户名：");
        String username = scanner.nextLine();
        System.out.println("输入密码：");
        String password = scanner.nextLine();

        UserService userService = new UserService();
        if (userService.login(username, password)){
            System.out.println("用户登陆成功");
        }else{
            System.out.println("用户登录失败");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if (userService.login(user)){
            System.out.println("用户登陆成功");
        }else{
            System.out.println("用户登录失败");
        }

    }
}
