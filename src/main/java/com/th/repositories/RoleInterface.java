package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.entities.Role;

public interface RoleInterface extends JpaRepository<Role, String> {
 public Role findByRoleName(String roleName);
}
