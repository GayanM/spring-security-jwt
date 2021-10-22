package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.entities.UserEntity;
import io.javabrains.springsecurityjwt.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserEntityRepository userEntityRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("user: " + s);
        UserEntity userEntity = userEntityRepository.findByUsername(s);
        User user = new User(userEntity.getUsername(), userEntity.getPassword(), new ArrayList<>());
        return user;
    }
}
