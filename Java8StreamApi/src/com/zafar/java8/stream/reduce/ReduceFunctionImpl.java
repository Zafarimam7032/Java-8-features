package com.zafar.java8.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class ReduceFunctionImpl {

	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		Optional<StudentVo> optional = allStudents.stream()
		.limit(3)
		.reduce((studentVo, student)->studentVo.getAddress().length()>student.getAddress().length()?studentVo:student);
		if(optional.isPresent())
		{
			System.out.println(optional.get().getBooks().get(0));
		}
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer sum = integers.stream().reduce(1,(x,y)->x+y);
		
		System.out.println(sum);
		
		Integer multiply = integers.stream().reduce(1,(x,y)->x*y);
		System.out.println(multiply);
	}
}
