package com.example.springbootcaptcha.service;

import com.example.springbootcaptcha.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(User user);
    List<User> getAllUsers();
    Optional<User> getOneUser(Integer Id);

}
