package com.gubina.pp_3_1_1.repository;

import com.gubina.pp_3_1_1.model.User;

import java.util.List;

public interface UserRepository {

    User findById(Integer id);

    List<User> findAll();

    void addUser(User user);

    void updateUser(User user);

    void deleteById(Integer id);
}
