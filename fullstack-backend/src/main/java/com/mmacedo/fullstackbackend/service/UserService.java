package com.mmacedo.fullstackbackend.service;

import com.mmacedo.fullstackbackend.mapper.UserMapper;
import com.mmacedo.fullstackbackend.model.User;
import com.mmacedo.fullstackbackend.repository.UserRepository;
import com.mmacedo.fullstackbackend.requests.UserPostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;

    public User save(UserPostRequestBody userPostRequestBody) {
        return repository.save(UserMapper.INSTANCE.toEntity(userPostRequestBody));
    }
}
