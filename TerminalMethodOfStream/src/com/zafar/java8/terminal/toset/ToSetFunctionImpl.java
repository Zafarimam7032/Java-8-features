package com.zafar.java8.terminal.toset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetFunctionImpl {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3,12,34,23,12,12, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collect = numbers.stream().collect(Collectors.toList());
		System.out.println(collect);
		 Set<Integer> set = numbers.stream().collect(Collectors.toSet());
		 System.out.println(set);
	}
}
