package com.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @program: day06
 * @ClassName QueryTest
 * @description:
 * @author: huJie
 * @create: 2020-10-21 16:33
 **/
public class InsertTest {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getSource());
        String sql = "insert into user(username, password) values(?,?)";
        Object[] params = {"wangwu","wwwwww"};
//        User insert = queryRunner.insert(sql, new BeanHandler<>(User.class), params);
        int update = queryRunner.update(sql, params);
        System.out.println(update);

    }
}
