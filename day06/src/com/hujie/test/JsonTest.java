package com.hujie.test;

import com.hujie.model.User;
import com.hujie.util.FileToList;

import java.io.File;
import java.util.List;

/**
 * @program: day06
 * @ClassName JsonTest
 * @description:
 * @author: huJie
 * @create: 2020-10-21 11:56
 **/
public class JsonTest {
    public static void main(String[] args) {

        String filename = "resource" + File.separator + "user.txt";
        List<User> listUser = FileToList.getListUser(filename);
        for (User user: listUser) {
            System.out.println(user);
        }
    }
}
