package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<UserRole,Long> {
    UserRole findByRoleName(String roleName);
}
