package com.duytran.demo.controller;

import com.duytran.demo.model.AccountCredentials;
import com.duytran.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping
    public List<AccountCredentials> getAllUsers(){
        return usersRepository.findAll();
    }
}