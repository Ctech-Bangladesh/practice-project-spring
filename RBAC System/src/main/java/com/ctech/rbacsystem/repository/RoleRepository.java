package com.ctech.rbacsystem.repository;

import com.ctech.rbacsystem.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}
