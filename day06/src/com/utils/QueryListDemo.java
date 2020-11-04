package com.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @program: day06
 * @ClassName QueryListDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-21 17:23
 **/
public class QueryListDemo {
    public static void main(String[] args) throws SQLException {

        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getSource());

        String sql = "select * from user";
        List<User> query = queryRunner.query(sql, new BeanListHandler<>(User.class));
        for (User u :
                query) {
            System.out.println(u.toString());
        }
    }
}
