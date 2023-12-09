package com.ctech.rbacsystem.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "user")
public class Users {

  @Id
  private ObjectId uid;
  private String name;
  private boolean approved;
  private boolean status;

  @DBRef
  private Roles roles;


}
