package com.kata.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*https://www.jmdoudoux.fr/java/dej/chap-streams.htm
 * Les méthodes intermédiaires : map(), mapToInt(), flatMap(), mapToDouble(), filter(), distinct(), sorted(), peek(), limit(), skip(), parallel(),
 * sequential(), unordered()
   Les méthodes terminales : forEach(), forEachOrdered(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), 
   findFirst(), findAny(), iterator()
 */
public class UpperCase {
 
	public static Collection<String> mapToUppercaseJ7(String... names){
		Collection<String> uppercaseNames = new ArrayList<String>();
		for(String name : names) {
			uppercaseNames.add(name.toUpperCase());
		}
		return uppercaseNames;
	}

	public static  Collection<String> mapToUppercaseJ8(String... names){
		//Collection<String> uppercaseNames = new ArrayList<String>();
		
		//return Arrays.asList(names).stream().map(String::toUpperCase).collect(Collectors.toList());
		// ou encore en utilisant une expression Lamda
		//return Arrays.asList(names).stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		//ou encore: ici pas besoin de transformer en list avant de streamer
		return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
	}
	
	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
		
		return 0 ;
	}
}
