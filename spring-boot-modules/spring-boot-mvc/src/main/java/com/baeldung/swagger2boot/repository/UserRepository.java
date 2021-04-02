package com.nabgc.swagger2boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nabgc.swagger2boot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
