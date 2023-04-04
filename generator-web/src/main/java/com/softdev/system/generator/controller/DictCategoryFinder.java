package com.softdev.system.generator.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zz
 * 数据字典生成
 */
public class DictCategoryFinder {
    // JDBC驱动名及数据库URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println("实例化PreparedStatement对象...");
            String sql = "SELECT * FROM t_dict WHERE category_code = ?";
            stmt = conn.prepareStatement(sql);

            // 获取字段注释中的dictCategory值
            String dictCategory = "xxx";
            String fieldComment = "dictCategory:" + dictCategory;

            // 设置查询参数
            stmt.setString(1, fieldComment);

            // 执行查询
            ResultSet rs = stmt.executeQuery();

            // 处理结果集
            while (rs.next()) {
                // 获取记录的各个字段值
                int id = rs.getInt("id");
                String categoryCode = rs.getString("category_code");
                String categoryName = rs.getString("category_name");
                String dictValue = rs.getString("dict_value");
                String dictLabel = rs.getString("dict_label");

                // 输出记录
                System.out.print("ID: " + id);
                System.out.print(", category_code: " + categoryCode);
                System.out.print(", category_name: " + categoryName);
                System.out.print(", dict_value: " + dictValue);
                System.out.println(", dict_label: " + dictLabel);
            }

            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
        }
    }
}

