package com.zafar.java8.stream.matcher;

import java.util.Arrays;
import java.util.List;

public class MatcherFunctionImpl {

	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		boolean allMatch = integers.stream().allMatch(number->number>0);
		boolean allMatch1 = integers.stream().allMatch(number->number>1);
		System.out.println(allMatch);//true
		System.out.println(allMatch1);//false
		boolean anyMatch = integers.stream().anyMatch(number->number>0);
		boolean anyMatch1 = integers.stream().anyMatch(number->number>1);
		System.out.println(anyMatch);//true
		System.out.println(anyMatch1);//true		
	}
}
