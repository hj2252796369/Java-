package com.hujie.dao;

import com.hujie.model.User;

/**
 * @program: day06
 * @ClassName IUserDao
 * @description:
 * @author: huJie
 * @create: 2020-10-21 11:36
 **/
public interface IUserDao {
    User login(String username, String password);
}
