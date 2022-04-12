package com.th.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.th.entities.Role;
import com.th.entities.User;
import com.th.repositories.RoleInterface;
import com.th.repositories.UserRepository;

@Service
@Transactional
public class AccountServiceImplement implements AccountService {

	@Bean
	public BCryptPasswordEncoder getBCPE()
	{
		return new BCryptPasswordEncoder();
		
	}
	@Autowired
	UserRepository userRepository;
	@Autowired 
	RoleInterface roleRepository;
	
	@Override
	public User saveUser(User appUser) {
		// TODO Auto-generated method stub
		
		String hashPW=this.getBCPE().encode(appUser.getPassword()); //hashPW = le mot de passe crypté
		System.out.print(hashPW);
		appUser.setPassword(hashPW);
		return userRepository.save(appUser);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String login, String roleName) {
		// TODO Auto-generated method stub
		Role role=roleRepository.findByRoleName(roleName);
		User user=userRepository.findByLogin(login);
		user.getRoles().add(role);
	}

	@Override
	public User findUserByUserName(String login) {
		// TODO Auto-generated method stub
		return userRepository.findByLogin(login);
	}

}
