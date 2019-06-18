package com.kata.training.kata;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;
import org.junit.Test;

import com.kata.streams.UnderAge;
import com.training.beans.Person;


public class UnderAgeTest {

	  @Test
	  public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
	    Person sara = new Person("Sara", 4);
	    Person viktor = new Person("Viktor", 40);
	    Person eva = new Person("Eva", 42);
	    Person anna = new Person("Anna", 5);
	    List<Person> collection = Arrays.asList(sara, eva, viktor, anna);
	   /*assertThat(UnderAge.getKidNames(collection))
	        .contains("Sara", "Anna")
	        .doesNotContain("Viktor", "Eva");*/
	  //  assertThat(collection.get(0).getName(),Is("Sara"));
	    
	   // assertThat(actual, matcher);
	   // assertThat(UnderAge.getKidNames(collection), );
	  }

}
