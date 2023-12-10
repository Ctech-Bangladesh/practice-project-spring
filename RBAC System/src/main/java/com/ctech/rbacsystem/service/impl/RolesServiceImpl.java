package com.ctech.rbacsystem.service.impl;

import com.ctech.rbacsystem.dto.RolesDTO;
import com.ctech.rbacsystem.entity.Roles;
import com.ctech.rbacsystem.repository.RolesRepository;
import com.ctech.rbacsystem.service.RolesService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolesServiceImpl implements RolesService {

  private final RolesRepository rolesRepository;

  @Override
  public Roles saveRole(RolesDTO rolesDTO) {
    Roles roles = new Roles();
    BeanUtils.copyProperties(rolesDTO, roles);
    return rolesRepository.save(roles);
  }

  @Override
  public List<Roles> getRoles() {
    return rolesRepository.findAll();
  }

  @Override
  public void deleteRoleById(String rid) {
    rolesRepository.deleteById(rid);

  }

}
