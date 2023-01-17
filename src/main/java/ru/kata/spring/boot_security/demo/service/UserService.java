package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findById(Long id);
    User find(String email);
    List<User> findAll();
    void deleteById(Long id);
    void save(User user);
}
