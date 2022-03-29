package com.th.service;

import com.th.entities.Role;
import com.th.entities.User;

public interface AccountService {
	public User saveUser(User appUser);
	public Role saveRole(Role role);
	public void addRoleToUser(String username, String roleName);
	public User findUserByUserName(String username);
	
}
