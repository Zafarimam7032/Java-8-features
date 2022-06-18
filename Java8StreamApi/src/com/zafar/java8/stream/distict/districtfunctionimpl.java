package com.zafar.java8.stream.distict;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class districtfunctionimpl {
	
	public static void main(String[] args) {
		List<String> collect = StudentDataBase.getAllStudents().stream().map(StudentVo::getStudentName).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5,1,4,5,2,3);
		List<Integer> collect2 = integers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		Set<Integer> collect3 = integers.stream().collect(Collectors.toSet());
		System.out.println(collect3);
	}
}
