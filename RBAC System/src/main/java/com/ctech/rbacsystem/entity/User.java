package com.ctech.rbacsystem.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private boolean approved;
    private String roleId;
    @DBRef
    private Role role;
}
