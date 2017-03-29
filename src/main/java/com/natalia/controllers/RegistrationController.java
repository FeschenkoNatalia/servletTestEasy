package com.natalia.controllers;

import com.natalia.ViewModel;
import com.natalia.model.User;
import com.natalia.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by User on 18.03.2017.
 */

public class RegistrationController implements Controller {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ViewModel process(HttpServletRequest request, HttpServletResponse response) {
        ViewModel vm = new ViewModel();
        User user = new User();

        user.setUsername((String) request.getAttribute("username"));
        user.setPassword((String) request.getAttribute("password"));
        user.setEmail((String) request.getAttribute("email"));

        userService.save(user);

        vm.setView("postProcPage");

        return vm;
    }
}



/*public class RegistrationController implements Controller{
    @Override
    public ViewModel process (HttpServletRequest request,HttpServletResponse response){
        ViewModel vm = new ViewModel();
        User user = new User();
        user.setUsername((String)request.getAttribute("username"));
        user.setPassword((String)request.getAttribute("password"));
        user.setEmail((String)request.getAttribute("email"));
        return null;
    }
}*/