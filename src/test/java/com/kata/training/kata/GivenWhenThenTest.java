package com.kata.training.kata;

import static org.junit.Assert.*;

import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GivenWhenThenTest {

	@Test
	public void letsMockListSize() {
		
		ArrayList myList = mock(ArrayList.class);
		myList = (ArrayList) Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		//when(myList.size()).thenReturn(10);
		assertEquals(10, myList.size()); // First Call
		//assertEquals(20, myList.size()); // Second Call

	}

}
