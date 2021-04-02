package com.nabgc.boot.embeddedRedis.domain.repository;

import com.nabgc.boot.embeddedRedis.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

}
