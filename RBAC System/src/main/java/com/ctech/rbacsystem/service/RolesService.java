package com.ctech.rbacsystem.service;

import com.ctech.rbacsystem.dto.RolesDTO;
import com.ctech.rbacsystem.entity.Roles;
import java.util.List;

public interface RolesService {

  List<Roles> getRoles();

  void deleteRoleById(String rid);

  Roles saveRole(RolesDTO rolesDTO);
}
