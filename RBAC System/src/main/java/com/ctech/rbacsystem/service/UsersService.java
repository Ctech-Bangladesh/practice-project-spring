package com.ctech.rbacsystem.service;

import com.ctech.rbacsystem.dto.UsersDTO;
import com.ctech.rbacsystem.entity.Users;
import java.util.List;

public interface UsersService {

  Users saveUser(UsersDTO usersDTO);

  List<Users> getUsers();

  void deleteById(String uid);


}
