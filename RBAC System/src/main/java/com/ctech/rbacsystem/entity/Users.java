package com.ctech.rbacsystem.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "user")
public class Users {

  @Id
  private String uid;
  private String name;
  private boolean approved;
  private boolean status;
  @DBRef
  private Roles roles;


}
