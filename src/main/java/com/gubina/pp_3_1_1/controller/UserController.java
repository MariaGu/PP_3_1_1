package com.gubina.pp_3_1_1.controller;

import com.gubina.pp_3_1_1.model.User;
import com.gubina.pp_3_1_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(Model model){
        model.addAttribute("user", new User());
        return "user-create";
    }

    @PostMapping
    public String createUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/user-update")
    public String createUpdateForm(Model model, @PathVariable("id") int id){
        model.addAttribute("user", userService.findById(id));
        return "user-update";
    }

    @PostMapping("/{id}/user-update")
    public String updateUser(@ModelAttribute("user") User user, Model model){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/user-delete")
    public String deleteById(@PathVariable("id") int id){
        userService.deleteById(id);
        return "redirect:/users";
    }


}
