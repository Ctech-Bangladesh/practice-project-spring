package com.ctech.rbacsystem.service;

import com.ctech.rbacsystem.entity.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);

    List<Role> getAllRoles();

    Role getAllRoleById(String id);

    Role updateUser(Role role);

    void deleteUser(String id);
}
