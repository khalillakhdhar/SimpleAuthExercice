package com.th.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
@Id
private String login;
private String password;
private String nomComplet;
private int active;
@ManyToMany(fetch = FetchType.EAGER)
private Collection<Role> roles=new ArrayList<Role>();
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNomComplet() {
	return nomComplet;
}
public void setNomComplet(String nomComplet) {
	this.nomComplet = nomComplet;
}
public Collection<Role> getRoles() {
	return roles;
}
public void setRoles(Collection<Role> roles) {
	this.roles = roles;
}
public User(String login, String password, String nomComplet, Collection<Role> roles) {
	super();
	this.login = login;
	this.password = password;
	this.nomComplet = nomComplet;
	this.roles = roles;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}



}
