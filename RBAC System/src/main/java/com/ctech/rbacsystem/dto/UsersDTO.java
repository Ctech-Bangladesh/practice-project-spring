package com.ctech.rbacsystem.dto;

import lombok.Data;

@Data

public class UsersDTO {

  private String name;
  private boolean approved;
  private boolean status;
  private String roleId;


}
