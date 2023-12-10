package com.ctech.rbacsystem.service.impl;

import com.ctech.rbacsystem.dto.UsersDTO;
import com.ctech.rbacsystem.entity.Roles;
import com.ctech.rbacsystem.entity.Users;
import com.ctech.rbacsystem.repository.RolesRepository;
import com.ctech.rbacsystem.repository.UsersRepository;
import com.ctech.rbacsystem.service.UsersService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

  private final UsersRepository usersRepository;
  private final RolesRepository rolesRepository;

  @Override
  public Users saveUser(UsersDTO usersDTO) {
    Optional<Roles> roles = rolesRepository.findById(usersDTO.getRoleId());
    if (!roles.isPresent()) {
      throw new RuntimeException("Not Fund");
    }
    Users userToCreate = new Users();
    BeanUtils.copyProperties(usersDTO, userToCreate);
    userToCreate.setRoles(roles.get());
    return usersRepository.save(userToCreate);
  }

  @Override
  public List<Users> getUsers() {
    return usersRepository.findAll();
  }

  @Override
  public void deleteById(String uid) {
    usersRepository.deleteById(uid);
  }

}
