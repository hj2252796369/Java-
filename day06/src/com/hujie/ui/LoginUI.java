package com.hujie.ui;

import com.hujie.service.IUserService;
import com.hujie.service.impl.UserServiceImpl;
import com.sun.deploy.security.SandboxSecurity;

import java.util.Scanner;

/**
 * @program: day06
 * @ClassName LoginUI
 * @description:
 * @author: huJie
 * @create: 2020-10-21 14:27
 **/
public class LoginUI {
    public static void main(String[] args) {

        IUserService userService = new UserServiceImpl();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        if(userService.login(username, password) != null){
            System.out.println("用户：" + username + " 登录成功");
        }else{
            System.out.println("用户登录失败...");
        }
    }
}
