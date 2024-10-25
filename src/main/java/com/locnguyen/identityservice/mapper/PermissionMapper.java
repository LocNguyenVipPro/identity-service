package com.locnguyen.identityservice.mapper;

import org.mapstruct.Mapper;

import com.locnguyen.identityservice.dto.request.PermissionRequest;
import com.locnguyen.identityservice.dto.response.PermissionResponse;
import com.locnguyen.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
