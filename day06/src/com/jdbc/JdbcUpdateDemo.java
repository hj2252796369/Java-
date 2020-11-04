package com.jdbc;

import java.sql.*;

/**
 * @program: day06
 * @ClassName JdbcDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-21 15:35
 **/
public class JdbcUpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接数据库，Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study_jdbc?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "123456");
//        String sql = "select * from user";
        String sql = "update user set password=? where id = ?";
        //获取ps对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "wangwuwuwuw");
        preparedStatement.setString(2, "2");
        //处理sql语句，【绑定参数】
        int executeUpdate = preparedStatement.executeUpdate();


        if (executeUpdate > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }

        preparedStatement.close();
        connection.close();
    }
}
