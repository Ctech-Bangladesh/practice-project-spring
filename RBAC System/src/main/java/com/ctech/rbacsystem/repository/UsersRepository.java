package com.ctech.rbacsystem.repository;

import com.ctech.rbacsystem.entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<Users, ObjectId> {

}
