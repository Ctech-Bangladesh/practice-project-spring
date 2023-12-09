package com.ctech.rbacsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesDTO {

  private String rName;
  private String[] privileges;
}
