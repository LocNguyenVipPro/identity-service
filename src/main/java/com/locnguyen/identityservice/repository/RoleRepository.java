package com.locnguyen.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locnguyen.identityservice.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
