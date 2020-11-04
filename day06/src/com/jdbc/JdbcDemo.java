package com.jdbc;

import java.sql.*;

/**
 * @program: day06
 * @ClassName JdbcDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-21 15:35
 **/
public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接数据库，Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study_jdbc?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "123456");
//        String sql = "select * from user";
        String sql = "select * from user where username = ? and password = ?";
        //获取ps对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "lisi");
        preparedStatement.setString(2, "12345");
        //处理sql语句，【绑定参数】
        ResultSet resultSet = preparedStatement.executeQuery();

        //处理结果
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("id = " + id + " username = " + username + "  password = " + password);
        }


        if (resultSet.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登录失败");
        }

        //释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
