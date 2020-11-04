package com.hujie.dao.impl;

import com.hujie.dao.IUserDao;
import com.hujie.model.User;
import com.hujie.util.JdbcUtil;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @program: day06
 * @ClassName UserDaoMySqlImpl
 * @description:
 * @author: huJie
 * @create: 2020-10-22 08:41
 **/
public class UserDaoMySqlImpl  implements IUserDao{
    @Override
    public User login(String username, String password) {

        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getSource());
        String sql = "select * from user where username = ? and password = ?";
        Object[] params = {username, password};

        try {
            User queryUser = queryRunner.query(sql, new BeanHandler<>(User.class), params);
            return queryUser;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
