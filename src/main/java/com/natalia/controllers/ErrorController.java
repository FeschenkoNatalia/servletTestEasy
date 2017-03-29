package com.natalia.controllers;

import com.natalia.Request;
import com.natalia.ViewModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by User on 25.03.2017.
 */
public class ErrorController implements Controller{
    @Override
    public ViewModel process(HttpServletRequest request, HttpServletResponse response) {
        return new ViewModel("/error.jsp");
    }
}
