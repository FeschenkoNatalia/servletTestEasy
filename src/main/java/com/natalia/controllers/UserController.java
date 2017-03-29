package com.natalia.controllers;

import com.natalia.ViewModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by User on 25.03.2017.
 */
public class UserController implements Controller {
    public ViewModel process (HttpServletRequest request, HttpServletResponse response) {
        return new ViewModel("user");
    }
}
