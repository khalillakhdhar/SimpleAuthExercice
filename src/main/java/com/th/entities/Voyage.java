package com.th.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Voyage {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotEmpty
private String date;
@NotEmpty
private String destination;
@NotEmpty
private String superviseur;
@NotNull
@Min(value = 100)
private double prix;
@NotEmpty
@Lob
private String description;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getSuperviseur() {
	return superviseur;
}
public void setSuperviseur(String superviseur) {
	this.superviseur = superviseur;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}








}
