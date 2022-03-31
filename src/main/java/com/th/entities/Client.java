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
@NotNull(message = "Adresse obligatoire")
private String adresse;
@Min(value = 16)
@NotNull
private int age;
@Email(message = "veuillez donner un email valide!")
@NotNull(message = "le email ne doit pas être vide")
private String email;
@Size(min = 5, max = 30, message = "la taille du nom est [5-30]")
@NotNull(message =  "le nom ne peut pas être vide")
private String nom;
@Size(min = 5, max = 30, message = "la taille du prenom est [5-30]")
@NotNull(message =  "le prenom ne peut pas être vide")
private String prenom;
@NotNull(message = "tel obligatoire!")
private String tel;
@NotNull(message = "veuillez saisir la grade!")
private String grade;





public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
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
