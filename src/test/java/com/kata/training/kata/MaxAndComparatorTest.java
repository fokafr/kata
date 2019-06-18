package com.kata.training.kata;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.kata.streams.MaxAndComparator;
import com.training.beans.Person;

public class MaxAndComparatorTest {

	  @Test
	  public void getOldestPersonShouldReturnOldestPerson() {
	    Person sara = new Person("Sara", 4);
	    Person viktor = new Person("Viktor", 40);
	    Person eva = new Person("Eva", 42);
	    List<Person> collection = Arrays.asList(sara,viktor,eva);
	   // assertTrue(MaxAndComparator.getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
	    assertTrue(MaxAndComparator.getOldestPerson(collection).getAge()==42);
	  }
	  
	  
	  
	  
	  @Test
	  public void ShouldReturnOldestPersonJava8() {
	    Person sara = new Person("Sara", 4);
	    Person viktor = new Person("Viktor", 40);
	    Person eva = new Person("Eva", 30);
	    List<Person> collection = Arrays.asList(sara,viktor,eva);
	   // assertTrue(MaxAndComparator.getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
	    assertTrue(MaxAndComparator.getOldestPersonJava8(collection).getAge()== 40);
	  }
	  
	  

}
