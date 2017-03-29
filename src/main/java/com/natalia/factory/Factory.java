package com.natalia.factory;

import com.natalia.controllers.*;
import com.natalia.dao.UserDao;
import com.natalia.dao.UserDaoImpl;
import com.natalia.services.UserService;
import com.natalia.services.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by User on 18.03.2017.
 */

public class Factory {

  /*  public static Connection getConnection() {

        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:kickstarter.db");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }*/
    public static Connection getConnection() {

        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static Controller getHomeController() {
        return new HomeController();
    }

    public static Controller getLoginController() {
        return new LoginController();
    }

  //  public static Controller errorController (){return new ErrorController();}

    public static Controller getRegistrationController(UserService userService) {
        return new RegistrationController(userService);
    }
    public static Controller getAllUsersController(UserService userService) {
        return new GetAllUsersController(userService);
    }
    public static UserService getUserServiceImpl(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }

    public static UserDao getUserDaoImpl(Connection connection) {
        return new UserDaoImpl(connection);
    }

}

/*public class Factory {
    public static Controller getHomeController (){
        return new HomeController();
    }

    public static Controller getLoginController() {
        return new LoginController();
    }

    public static Controller getRegistCationontroller (UserService userService){
        return new RegistrationController(userService);
    }

    public static getUserServiceImpl (UserDao userDao){
        return new
    }
}*/
