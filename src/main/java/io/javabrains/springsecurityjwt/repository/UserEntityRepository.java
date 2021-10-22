package io.javabrains.springsecurityjwt.repository;

import io.javabrains.springsecurityjwt.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface UserEntityRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}
