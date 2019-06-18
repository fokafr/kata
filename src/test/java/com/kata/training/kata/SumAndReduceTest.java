package com.kata.training.kata;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.kata.streams.SumAndReduce;

public class SumAndReduceTest {

	@Test
	  public void calculateShouldSumAllNumbers() {
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	    //assertTrue(SumAndReduce.calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
	    assertTrue(SumAndReduce.calculate(numbers)== 15);
	  }
}
