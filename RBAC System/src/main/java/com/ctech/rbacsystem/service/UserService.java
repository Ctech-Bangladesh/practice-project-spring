package com.ctech.rbacsystem.service;

import com.ctech.rbacsystem.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    List<User> getUserById(String id);

    User updateUser(User user);

    void deleteUser(String id);

}
