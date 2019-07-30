package com.gw.mongodemo.dao;

import com.gw.mongodemo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends MongoRepository<User, String> {
    public Optional<User> findByName(String name);
    public Optional<User> findByUserId(Integer userId);
}
