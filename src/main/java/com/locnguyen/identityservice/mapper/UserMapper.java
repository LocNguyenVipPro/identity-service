package com.locnguyen.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.locnguyen.identityservice.dto.request.UserCreationRequest;
import com.locnguyen.identityservice.dto.request.UserUpdateRequest;
import com.locnguyen.identityservice.dto.response.UserResponse;
import com.locnguyen.identityservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
