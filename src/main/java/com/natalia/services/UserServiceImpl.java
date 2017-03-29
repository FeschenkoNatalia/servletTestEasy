package com.natalia.services;

import com.natalia.dao.UserDao;
import com.natalia.model.User;

import java.util.List;

/**
 * Created by User on 18.03.2017.
 */
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User getByName(String username) {
        return userDao.getByName(username);
    }

    @Override
    public void remove(String username) {
        return;
        //userDao.remove(username);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
