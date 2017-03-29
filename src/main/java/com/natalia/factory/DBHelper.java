package com.natalia.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by User on 19.03.2017.
 */
public class DBHelper {
    public static void main(String[] args) throws SQLException {
        Connection connection = Factory.getConnection();
        Statement stmt = connection.createStatement();
        stmt.execute("create table users(userId int (5) PRIMARY KEY AUTO_INCREMENT, " +
                "username varchar(256), password varchar(256), " +
                "email varchar(256)");
        connection.close();
    }
}
