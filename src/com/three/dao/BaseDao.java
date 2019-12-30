package com.three.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseDao {


    static ComboPooledDataSource dataSource = new ComboPooledDataSource("c3p0-config.xml");
    static Connection conn = null;


    static {
        try {
            conn = dataSource.getConnection();
            if (conn != null) {
                System.out.println("数据库连接成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}