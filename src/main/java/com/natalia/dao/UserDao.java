package com.natalia.dao;

import com.natalia.model.User;

import java.util.List;

/**
 * Created by User on 18.03.2017.
 */
public interface UserDao extends GenericDao<User>{
    User save(User user);

    User getByName(String username);

    List<User> getAllUsers();

    void remove(String username);

    User update(User user);
}
