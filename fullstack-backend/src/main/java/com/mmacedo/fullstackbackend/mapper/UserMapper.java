package com.mmacedo.fullstackbackend.mapper;

import com.mmacedo.fullstackbackend.model.User;
import com.mmacedo.fullstackbackend.requests.UserPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserPostRequestBody userPostRequestBody);
    UserPostRequestBody toPostRequest(User user);
}
