package com.kata.streams;

import java.util.List;

public class SumAndReduce {

	public static int calculate(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().mapToInt(Integer::intValue).sum();
	}

}