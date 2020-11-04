package com.utils;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.DatabaseMetaData;
import java.util.ResourceBundle;

/**
 * @program: day06
 * @ClassName JdbcUtil
 * @description:
 * @author: huJie
 * @create: 2020-10-21 16:39
 **/
public class JdbcUtil {

    private static BasicDataSource dataSource;
    private static final String driver ;
    private static final String url ;
    private static final String username ;
    private static final String password ;

    static {

        dataSource = new BasicDataSource();

        //Java 项目 要把properties文件放在src目录下
        driver = ResourceBundle.getBundle("db").getString("driver");
        url = ResourceBundle.getBundle("db").getString("url");
        username = ResourceBundle.getBundle("db").getString("username");
        password = ResourceBundle.getBundle("db").getString("password");

        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }

    public static BasicDataSource getSource(){
        return dataSource;
    }
}
