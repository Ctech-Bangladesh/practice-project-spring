package com.ctech.rbacsystem.service.impl;

import com.ctech.rbacsystem.entity.Role;
import com.ctech.rbacsystem.entity.User;
import com.ctech.rbacsystem.repository.RoleRepository;
import com.ctech.rbacsystem.repository.UserRepository;
import com.ctech.rbacsystem.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User createUser(User user) {
        Optional<Role> userRole = roleRepository.findById(user.getRoleId());
        User tempUser = new User();
        BeanUtils.copyProperties(user, tempUser);
        tempUser.setRole(userRole.get());
        return userRepository.save(tempUser);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserById(String id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
