package com.training.stream;

import java.util.ArrayList;
import java.util.List;

/*L'API Stream est contenue dans le package java.util.stream. 
Ce package est composée de 10 interfaces, deux classes et une énumération*/

public class Exo2 {

	public static void main(String[] args) {
		List<Personne> personnes = new ArrayList<>(6);
		personnes.add(new Personne("p2", Genre.HOMME, 190));
		personnes.add(new Personne("p3", Genre.FEMME, 172));
		personnes.add(new Personne("p4", Genre.FEMME, 162));
		personnes.add(new Personne("p5", Genre.HOMME, 176));
		personnes.add(new Personne("p6", Genre.FEMME, 168));

		// On veut la moyenne de taille des femmes
		double  resultat = 0;
		
		resultat = personnes.stream().filter(p-> p.getGenre() == Genre.FEMME).mapToInt(p -> p.getTaille()).average().getAsDouble();	
		
		System.out.println(resultat);
	}

}
