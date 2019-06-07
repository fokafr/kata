package com.kata.training.kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.kata.streams.FlatMap;

public class FlatMapTest {

//Test transform
@Test
public void transformTest() {
	
	//given a List of List
	
	List<List<String>> container = new ArrayList<List<String>>();
	List<String> element1 = new ArrayList<String>();
	List<String> element2 = new ArrayList<String>();
	List<String> element3 = new ArrayList<String>();

	element1.add("hello1");
	element1.add("hello12");
	element1.add("hello13");
	element2.add("hello21");
	element2.add("hello22");
	element2.add("hello23");
	element3.add("hello31");
	element3.add("hello32");
	element3.add("hello33");
	container.add(element1);
	container.add(element2);
	container.add(element3);
	
	String[] atendu = {"hello1","hello12","hello13","hello21","hello22","hello23","hello31","hello32","hello33"};	
	//when
	FlatMap.transform(container);	
		
	//then	
	assertEquals(Arrays.asList(atendu), FlatMap.transform(container));
}


//Test transformWithStream
@Test
public void transformWithStreamTest() {
	
	//given a List of List
	
	List<List<String>> container = new ArrayList<List<String>>();
	List<String> element1 = new ArrayList<String>();
	List<String> element2 = new ArrayList<String>();
	List<String> element3 = new ArrayList<String>();

	element1.add("hello1");
	element1.add("hello12");
	element1.add("hello13");
	element2.add("hello21");
	element2.add("hello22");
	element2.add("hello23");
	element3.add("hello31");
	element3.add("hello32");
	element3.add("hello33");
	container.add(element1);
	container.add(element2);
	container.add(element3);
	
	String[] atendu = {"hello1","hello12","hello13","hello21","hello22","hello23","hello31","hello32","hello33"};	
	//when
	FlatMap.transformWithStream(container);	
		
	//then	
	assertEquals(Arrays.asList(atendu), FlatMap.transformWithStream(container));
}	
	
}
