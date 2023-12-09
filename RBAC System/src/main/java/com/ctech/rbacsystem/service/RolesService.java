package com.ctech.rbacsystem.service;

import com.ctech.rbacsystem.dto.RolesDTO;
import com.ctech.rbacsystem.entity.Roles;
import java.util.List;
import org.bson.types.ObjectId;

public interface RolesService {

  RolesDTO saveRole(RolesDTO rolesDTO);

  List<Roles> getRoles();
  void deleteRoleById(ObjectId rid);

}
