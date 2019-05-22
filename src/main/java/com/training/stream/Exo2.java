package com.training.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		//Map et FlatMap
		//La méthode map() renvoie un seul élément
		//La méthode flatMap() renvoie un Stream qui peut contenir zéro, un ou plusieurs éléments
		
		List<Integer> nombres = Arrays.asList(1,3,5,7,9);
		List<List<Integer>> tuples = nombres.stream().map(nombre -> Arrays.asList(nombre-1,nombre))
											.collect(Collectors.toList());
		System.out.println("Avec les map "+tuples);		
		
		//****************************************************************************************
		List<Integer> nbrs = Arrays.asList(1,3,5,7,9);
		//L'opération flatMap() attend en paramètre une Function qui renvoie un Stream
		List<Integer> nombresDesTuples = nbrs.stream().flatMap(nombre -> Arrays.asList(nombre-1,nombre).stream())
											.collect(Collectors.toList());
		System.out.println("Avec les flatMap "+nombresDesTuples);	
		
		
	}

}
