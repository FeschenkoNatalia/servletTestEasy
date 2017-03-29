package com.natalia.dao;

import com.natalia.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18.03.2017.
 */

public class UserDaoImpl implements UserDao {

    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User save(User user) {
        try {
            PreparedStatement statement =
                    connection.prepareStatement("insert into users(username, password, email) values(?,?,?)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //user jdbc from prev lessons
        return user;
    }

    @Override
    public User getByName(String username) {
        User user = null;
        try {
            PreparedStatement statement = connection.prepareStatement("select * from users where username = ?");
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            rs.next();

            String email = rs.getString("email");
            int userId = rs.getInt("userId");
            user = User.from(userId, username, email);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public void remove(String username) {
        try {
            PreparedStatement statement =
                    connection.prepareStatement("delete * from users where username = ?");
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            rs.next();

        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return;
    }

    @Override
    public User update(User user) {
        try {
            PreparedStatement statement =
                    connection.prepareStatement("update users set username=?, password=?, email=? where userId = ?");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try {
            PreparedStatement statement =
                    connection.prepareStatement("select * from users");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                /*User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));

                users.add(user);*/
                int userId = rs.getInt("userId");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                User user = new User(userId,username,password,email);
                System.out.println("userId="+user.getUserId());
                System.out.println("username="+user.getUsername());
                System.out.println("email="+user.getEmail());
                System.out.println("password="+user.getPassword());
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
