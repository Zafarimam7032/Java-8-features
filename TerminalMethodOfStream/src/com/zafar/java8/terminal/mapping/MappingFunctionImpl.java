package com.zafar.java8.terminal.mapping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class MappingFunctionImpl {

	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		List<String> ListStudentName = allStudents.stream().collect(Collectors.mapping(StudentVo::getStudentName,Collectors.toList()));
		System.out.println(ListStudentName);
		Set<String> collect = allStudents.stream().collect(Collectors.mapping(StudentVo::getStudentName,Collectors.toSet()));
		System.out.println(collect);


	}
}
