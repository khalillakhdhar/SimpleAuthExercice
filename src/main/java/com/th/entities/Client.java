package com.th.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
private String adresse;
@Min(value = 16)
@NotNull
private int age;
@Email
@NotNull
private String email;
@Size(min = 5, max = 30)
@NotNull
private String nom;
@Size(min = 5, max = 30)
@NotNull
private String prenom;
@NotNull
private String tel;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}







}
