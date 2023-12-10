package com.ctech.rbacsystem.controller;

import com.ctech.rbacsystem.dto.RolesDTO;
import com.ctech.rbacsystem.dto.UsersDTO;
import com.ctech.rbacsystem.entity.Roles;
import com.ctech.rbacsystem.entity.Users;
import com.ctech.rbacsystem.service.RolesService;
import com.ctech.rbacsystem.service.UsersService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rbac")
public class RbacController {

  private final UsersService usersService;
  private final RolesService rolesService;

  @PostMapping("/user")
  public ResponseEntity<Users> addUser(@RequestBody UsersDTO usersDTO) {
    return ResponseEntity.ok(usersService.saveUser(usersDTO));
  }

  @GetMapping("/user")
  public List<Users> showEmployee() {
    return usersService.getUsers();
  }

  @DeleteMapping("/user/delete/{id}")
  public String deleteUser(@PathVariable(value = "id") String uid) {
    usersService.deleteById(uid);
    return "User Delete successfully";
  }

  @PostMapping("/role")
  public Roles addRole(@RequestBody RolesDTO rolesDTO) {
    return rolesService.saveRole(rolesDTO);
  }

  @GetMapping("/role")
  public List<Roles> showRoles() {
    return rolesService.getRoles();

  }

  @DeleteMapping("/role/delete/{id}")
  public String deleteRole(@PathVariable(value = "id") String rid) {
    rolesService.deleteRoleById(rid);
    return "Role Delete Successfully";
  }


}
