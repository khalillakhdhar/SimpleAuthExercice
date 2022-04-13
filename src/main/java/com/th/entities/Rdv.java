package com.th.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Rdv {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
private String date;
@NotEmpty // # null et de ""
private String titre;
@NotBlank // # null or empty or " " 
@Size(min = 5, max = 20, message ="le type doit être de longueur entre 5 et 20" )
private String type;
@Size(min = 10)
private String description;
@Min(value = 5)
private int duree;
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
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public Rdv(String date, @NotEmpty String titre,
		@NotBlank @Size(min = 5, max = 20, message = "le type doit être de longueur entre 5 et 20") String type,
		@Size(min = 10) String description, @Min(5) int duree) {
	super();
	this.date = date;
	this.titre = titre;
	this.type = type;
	this.description = description;
	this.duree = duree;
}
public Rdv() {
	super();
}







}
