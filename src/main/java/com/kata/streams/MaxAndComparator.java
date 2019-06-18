package com.kata.streams;

import java.util.Comparator;
import java.util.List;

import com.training.beans.Person;

public class MaxAndComparator {

	public static Person getOldestPerson(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}
	
	public static Person getOldestPersonJava8(List<Person> people) {
	 
		//Comparator<Person> comparator = Comparator.comparing(Person::getAge);
		
		//return people.stream().max(comparator).get();
		//ou encore
		return people.stream().max(Comparator.comparing(Person::getAge)).get();
	}
}
