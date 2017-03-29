package com.natalia.controllers;

import com.natalia.ViewModel;
import com.natalia.model.User;
import com.natalia.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class GetAllUsersController implements Controller {
    private final UserService userService;

    public GetAllUsersController(UserService userService) {
        this.userService = userService;
    }

    public ViewModel process (HttpServletRequest request, HttpServletResponse response) {
        List <User> users = userService.getAllUsers();
        return new ViewModel("users").withAttribute("users",users);
    }
}