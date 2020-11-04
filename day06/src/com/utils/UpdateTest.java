package com.utils;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * @program: day06
 * @ClassName QueryTest
 * @description:
 * @author: huJie
 * @create: 2020-10-21 16:33
 **/
public class UpdateTest {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getSource());
        String sql = "update user set password = ?  where username = ?";
        Object[] params = {"1111111","wangwu"};
//        User insert = queryRunner.insert(sql, new BeanHandler<>(User.class), params);
        int update = queryRunner.update(sql, params);
        System.out.println(update);

    }
}
