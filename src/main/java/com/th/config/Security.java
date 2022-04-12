package com.th.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
@Autowired
private DataSource dataSource; 
@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;

@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception
{
//	auth.inMemoryAuthentication().withUser("myadmin").password("{noop}admin").roles("Admininstrateur");
	
//	auth.inMemoryAuthentication().withUser("myuser").password("{noop}user").roles("utilisateur");
	
	auth.jdbcAuthentication().dataSource(dataSource)
	.usersByUsernameQuery( // on verifie l'existance de l'élément unique username (email cin, login)
			"select login as principal ,password, active as credentials from admin where login=?")
	.authoritiesByUsernameQuery( // on utilise le même paramétre pour récupérer les roles
			"select admin_login as principal , roles_role_name as role from admin_roles "
					+ "where admin_login=?")
	.passwordEncoder(bCryptPasswordEncoder).rolePrefix("ROLE_"); // encoder le password
	// chercher le mdp => associer le mot ROLE_ comme prefix pour les roles récupérer
	
	}

@Override
protected void configure(HttpSecurity http) throws Exception
{
//http.formLogin();
http.csrf().disable().authorizeRequests().and()
// .formLogin().and()
.httpBasic();
http.authorizeRequests().antMatchers("/login/**").permitAll();
//http.authorizeRequests().antMatchers("/client/**").permitAll();

http.authorizeRequests().antMatchers("/api/**").hasRole("administrateur");
//http.authorizeRequests().antMatchers("/api/**").permitAll();
//autorisé pour tout le monde

//http.authorizeRequests().antMatchers(HttpMethod.POST, "/produit").hasRole("Admininstrateur");
http.authorizeRequests().anyRequest().authenticated(); // le reste des requêtes est accessible uniquement si user=> authentificated
}

	
	
}
