package com.kata.streams;

import java.util.ArrayList;
import java.util.List;

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
}
