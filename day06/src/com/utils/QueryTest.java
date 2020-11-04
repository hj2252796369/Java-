package com.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.io.File;
import java.sql.SQLException;

/**
 * @program: day06
 * @ClassName QueryTest
 * @description:
 * @author: huJie
 * @create: 2020-10-21 16:33
 **/
public class QueryTest {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getSource());
        String sql = "select * from user where username = ? and password=?";
        User queryUser = queryRunner.query(sql, new BeanHandler<>(User.class),"lisi","123");
        System.out.println(queryUser);

    }
}
