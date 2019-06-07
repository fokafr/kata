package com.kata.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static List<String> transform(List<List<String>> collection){
		List<String> newCollection = new ArrayList<String>();
		for(List<String> subCollection : collection) {
			for(String value : subCollection) {
				newCollection.add(value);
			}
		}
		
		return newCollection ;
	}
	
	// le flatMap comme son nom l'indique, permet d'applanir une liste. Il prend un Stream en paramètre
	public static List<String> transformWithStream(List<List<String>> collection){
		List<String> newCollection = new ArrayList<String>();
		newCollection = collection.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		return newCollection;
	}
	
	
	
}
