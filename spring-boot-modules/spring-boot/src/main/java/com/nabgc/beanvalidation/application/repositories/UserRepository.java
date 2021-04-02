package com.nabgc.beanvalidation.application.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nabgc.beanvalidation.application.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
