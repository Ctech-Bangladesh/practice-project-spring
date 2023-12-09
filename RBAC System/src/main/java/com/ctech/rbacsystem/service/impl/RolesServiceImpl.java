package com.ctech.rbacsystem.service.impl;

import com.ctech.rbacsystem.dto.RolesDTO;
import com.ctech.rbacsystem.entity.Roles;
import com.ctech.rbacsystem.repository.RolesRepository;
import com.ctech.rbacsystem.service.RolesService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolesServiceImpl implements RolesService {

  private final RolesRepository rolesRepository;


  @Override
  public RolesDTO saveRole(RolesDTO rolesDTO) {
    Roles roles = convertDtoToEntity(rolesDTO);
    return convertEntityToDto(rolesRepository.save(roles));
  }

  @Override
  public List<Roles> getRoles() {
    return rolesRepository.findAll();
  }

  @Override
  public void deleteRoleById(ObjectId rid) {
    rolesRepository.deleteById(rid);

  }

  public RolesDTO convertEntityToDto(Roles roles) {
    RolesDTO dto = new RolesDTO();
    dto.setRName(roles.getRName());
    dto.setPrivileges(roles.getPrivileges());
    return dto;
  }

  public Roles convertDtoToEntity(RolesDTO rolesDTO) {
    Roles dt = new Roles();
    dt.setRName(rolesDTO.getRName());
    dt.setPrivileges(rolesDTO.getPrivileges());
    return dt;
  }
}
