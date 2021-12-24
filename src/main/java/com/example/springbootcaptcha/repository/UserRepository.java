package com.example.springbootcaptcha.repository;

import com.example.springbootcaptcha.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
