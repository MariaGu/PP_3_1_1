package com.gubina.pp_3_1_1.controller;

import com.gubina.pp_3_1_1.model.User;
import com.gubina.pp_3_1_1.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String findAll(){
        List<User> users = userService.findAll();

        return "";
    }
}
