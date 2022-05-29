package com.gubina.pp_3_1_1.service;

import com.gubina.pp_3_1_1.model.User;


import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    void addUser(User user);

    void updateUser(User user);

    void deleteById(Integer id);
}
