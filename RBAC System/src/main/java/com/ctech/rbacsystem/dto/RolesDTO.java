package com.ctech.rbacsystem.dto;

import lombok.Data;

@Data

public class RolesDTO {

  private String rName;
  private String[] privileges;
}
