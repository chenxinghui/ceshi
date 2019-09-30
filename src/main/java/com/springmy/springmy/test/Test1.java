package com.springmy.springmy.test;

import java.sql.*;

/*
jdbc数据库连接
 */
public class Test1 {

    public static void main(String[] args){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        System.out.println("uouu");

        try {
            //1.加载jdbc驱动com.mysql.jdbc.driver
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立并获取数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf-8","root","root");
            //创建sql
            String sql = "select * from **";
            //3.创建statement对象
            preparedStatement = connection.prepareStatement(sql);
            //4.执行sql语句并获得结果集
            resultSet = preparedStatement.executeQuery();
            //5.对执行的结果集进行转换，并将处理结果返回
            //6.释放资源
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
