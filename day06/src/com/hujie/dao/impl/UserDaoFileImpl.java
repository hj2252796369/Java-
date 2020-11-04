package com.hujie.dao.impl;

import com.hujie.dao.IUserDao;
import com.hujie.model.User;
import com.hujie.util.FileToList;

import java.io.File;
import java.util.List;

/**
 * @program: day06
 * @ClassName UserDaoImpl
 * @description:
 * @author: huJie
 * @create: 2020-10-21 14:29
 **/
public class UserDaoFileImpl implements IUserDao {
    @Override
    public User login(String username, String password) {
        String filename = "resource" + File.separator + "user.txt";
        List<User> listUser = FileToList.getListUser(filename);
        for (User user: listUser) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
