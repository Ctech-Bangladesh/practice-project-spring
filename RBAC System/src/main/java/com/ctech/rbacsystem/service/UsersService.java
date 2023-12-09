package com.ctech.rbacsystem.service;

import com.ctech.rbacsystem.dto.UsersDTO;
import com.ctech.rbacsystem.entity.Users;
import java.util.List;
import org.bson.types.ObjectId;

public interface UsersService {

  UsersDTO saveUser(UsersDTO usersDTO);

  List<Users> getUsers();

  void deleteById(ObjectId uid);


}
