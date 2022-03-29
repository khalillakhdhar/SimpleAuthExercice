package com.th.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
private String type;
@NotNull
private String titre;
@Lob
private String description;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Produit(@NotNull String type, @NotNull String titre, String description) {
	super();
	this.type = type;
	this.titre = titre;
	this.description = description;
}
public Produit() {

}

}
