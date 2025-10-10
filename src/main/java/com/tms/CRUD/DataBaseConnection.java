package com.tms.CRUD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DataBaseConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("C:\\Users\\79815\\IdeaProjects\\HW28\\src\\main\\resources\\app.props"));
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                prop.getProperty("db_url"),
                prop.getProperty("db_login"),
                prop.getProperty("db_password"));
        return connection;
    }
}