package com.training.stream;

public class Personne {
String id;
Genre genre;
int taille;
public String getId() {
	return id;
}
public Genre getGenre() {
	return genre;
}
public int getTaille() {
	return taille;
}
public void setId(String id) {
	this.id = id;
}
public void setGenre(Genre genre) {
	this.genre = genre;
}
public void setTaille(int taille) {
	this.taille = taille;
}
public Personne(String id, Genre homme, int taille) {
	super();
	this.id = id;
	this.genre = homme;
	this.taille = taille;
}




}
