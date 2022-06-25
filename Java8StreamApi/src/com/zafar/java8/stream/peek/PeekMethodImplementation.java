package com.zafar.java8.stream.peek;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;

public class PeekMethodImplementation {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.stream().peek(num->System.out.print(num+ " ")).collect(Collectors.toList());
		numbers.stream().peek(System.out::print).collect(Collectors.toList());
		
		StudentDataBase.getAllStudents().stream().peek(s->System.out.println()).peek(System.out::print).collect(Collectors.counting());
	}
}
