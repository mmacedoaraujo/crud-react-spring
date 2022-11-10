package com.mmacedo.fullstackbackend.controller;

import com.mmacedo.fullstackbackend.mapper.UserMapper;
import com.mmacedo.fullstackbackend.model.User;
import com.mmacedo.fullstackbackend.repository.UserRepository;
import com.mmacedo.fullstackbackend.requests.UserPostRequestBody;
import com.mmacedo.fullstackbackend.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserPostRequestBody> createNewUser(@RequestBody UserPostRequestBody userPostRequestBody) {
        User savedUser = service.save(userPostRequestBody);
        return new ResponseEntity<>(UserMapper.INSTANCE.toPostRequest(savedUser), HttpStatus.CREATED);
    }
}
