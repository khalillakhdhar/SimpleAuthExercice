package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
public User findByLogin(String login);
}
