package com.kata.training.kata;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.kata.streams.UpperCase;

public class UpperCaseTest {
 
@Test
public void testmapToUppercaseJ7() {
	System.out.println("Testing if [aaron, frank, william, gilliam] returns [AARON, FRANK, WILLIAM, GILLIAM] for java 7");
	String[] names = {"aaron","frank","william","gilliam"};
	String[] namesUpper ={"AARON","FRANK","WILLIAM","GILLIAM"};
	assertTrue(UpperCase.mapToUppercaseJ7(names).containsAll(Arrays.asList(namesUpper)));
}

@Test
public void testmapToUppercaseJ8() {
	System.out.println("Testing if [aymar, frank, william, gilliam] returns [AARON, FRANK, WILLIAM, GILLIAM] for Java 8");
	String[] names = {"aymar","frank","william","gilliam"};
	String[] namesUpper ={"AYMAR","FRANK","WILLIAM","GILLIAM"};
	assertTrue(UpperCase.mapToUppercaseJ8(names).containsAll(Arrays.asList(namesUpper)));
}

@Test

public void testgetTotalNumberOfLettersOfNamesLongerThanFive() {
	System.out.println("Testing if [aymar, franky, william, gille] returns  for Java 8 value of 13");
	String[] names = {"aymar","franky","william","gille"};
	//System.out.println(UpperCase.getTotalNumberOfLettersOfNamesLongerThanFive(names));
	assertTrue(UpperCase.getTotalNumberOfLettersOfNamesLongerThanFive(names) == 13);
}

}
