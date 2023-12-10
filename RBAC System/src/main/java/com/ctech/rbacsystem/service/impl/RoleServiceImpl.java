package com.ctech.rbacsystem.service.impl;

import com.ctech.rbacsystem.entity.Role;
import com.ctech.rbacsystem.repository.RoleRepository;
import com.ctech.rbacsystem.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getAllRoleById(String id) {
        return null;
    }

    @Override
    public Role updateUser(Role role) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
