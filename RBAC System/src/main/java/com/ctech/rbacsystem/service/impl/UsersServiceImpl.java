package com.ctech.rbacsystem.service.impl;

import com.ctech.rbacsystem.dto.UsersDTO;
import com.ctech.rbacsystem.entity.Users;
import com.ctech.rbacsystem.repository.RolesRepository;
import com.ctech.rbacsystem.repository.UsersRepository;
import com.ctech.rbacsystem.service.UsersService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

  private final UsersRepository usersRepository;


  @Override
  public UsersDTO saveUser(UsersDTO usersDTO) {
    Users users = convertDtoToEntity(usersDTO);
    return convertEntityToDto(usersRepository.save(users));
  }

  @Override
  public List<Users> getUsers() {
    return usersRepository.findAll();
  }

  @Override
  public void deleteById(ObjectId uid) {
    usersRepository.deleteById(uid);
  }

  public UsersDTO convertEntityToDto(Users users) {
    UsersDTO dto = new UsersDTO();
    dto.setName(users.getName());
    dto.setApproved(users.isApproved());
    dto.setStatus(users.isStatus());

    return dto;
  }

  public Users convertDtoToEntity(UsersDTO usersDTO) {
    Users dt = new Users();
    dt.setName(usersDTO.getName());
    dt.setApproved(usersDTO.isApproved());
    dt.setStatus(usersDTO.isStatus());
    return dt;
  }

}
