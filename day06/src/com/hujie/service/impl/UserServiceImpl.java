package com.hujie.service.impl;

import com.hujie.dao.IUserDao;
import com.hujie.dao.impl.UserDaoFileImpl;
import com.hujie.dao.impl.UserDaoMySqlImpl;
import com.hujie.model.User;
import com.hujie.service.IUserService;

/**
 * @program: day06
 * @ClassName UserServiceImpl
 * @description:
 * @author: huJie
 * @create: 2020-10-21 14:28
 **/
public class UserServiceImpl implements IUserService {
//    IUserDao userDao = new UserDaoFileImpl();
    IUserDao userDao = new UserDaoMySqlImpl();
    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }
}
