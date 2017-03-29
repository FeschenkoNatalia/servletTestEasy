package com.natalia.services;

import com.natalia.model.User;

import java.util.List;

/**
 * Created by User on 18.03.2017.
 */
public interface UserService {

        User save(User user);

        User getByName(String username);

        void remove(String username);

        User update(User user);

        List<User> getAllUsers();

    }
