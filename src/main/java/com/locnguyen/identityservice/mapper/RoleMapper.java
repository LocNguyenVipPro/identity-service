package com.locnguyen.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.locnguyen.identityservice.dto.request.RoleRequest;
import com.locnguyen.identityservice.dto.response.RoleResponse;
import com.locnguyen.identityservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
