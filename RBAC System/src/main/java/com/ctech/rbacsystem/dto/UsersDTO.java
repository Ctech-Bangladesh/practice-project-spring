package com.ctech.rbacsystem.dto;

import com.ctech.rbacsystem.entity.Roles;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data

public class UsersDTO {

  private String name;
  private boolean approved;
  private boolean status;

  @DBRef
  private Roles roles;

}
