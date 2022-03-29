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
private DataSource dataSource; // parametre de récupération permanente des résultat de la BD
// format de données object
//@Autowired
//private BCryptPasswordEncoder bCryptPasswordEncoder;

@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception
{
	auth.inMemoryAuthentication().withUser("myadmin").password("{noop}admin").roles("Admininstrateur");
	auth.inMemoryAuthentication().withUser("myuser").password("{noop}user").roles("utilisateur");
	}

@Override
protected void configure(HttpSecurity http) throws Exception
{
http.formLogin();
http.csrf().disable();
http.authorizeRequests().antMatchers("/login/**").permitAll();
http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/produit").hasRole("Admininstrateur");
http.authorizeRequests().antMatchers(HttpMethod.POST, "/produit").hasRole("Admininstrateur");
//http.authorizeRequests().anyRequest().authenticated();
}

	
	
}
