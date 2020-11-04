package com.hujie.service;

import com.hujie.model.User;

/**
 * @program: day06
 * @ClassName IUserService
 * @description:
 * @author: huJie
 * @create: 2020-10-21 11:36
 **/
public interface IUserService {

    User login(String username, String password);

}
